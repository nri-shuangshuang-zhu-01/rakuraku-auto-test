package jp.co.misumi.creditmanagement.rest.Interceptor;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.IOUtils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class HeaderInterceptor implements ClientHttpRequestInterceptor {

  @java.lang.Override
  public ClientHttpResponse intercept(
      HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
    String url = "E:\\request.log";
    FileWriter fw = null;
    fw = new FileWriter(url, true);
    String cmd = request.getURI().toString();
    request.getHeaders().toString();
    fw.write(cmd);
    String fromStream = IOUtils.toString(body, "UTF-8");
    fw.write(fromStream);
    fw.write("\r\n");
    fw.close();
    HttpServletRequest mainReq =
        ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    String mainHeader = mainReq.getHeader("Prefer");
    HttpHeaders headers = request.getHeaders();
    if (mainHeader != null && mainHeader.length() > 0) {
      if (mainHeader.contains("&")) {
        String[] headerArray = mainHeader.split("&");
        for (int i = 0; i < headerArray.length; i++) {
          if (request.getURI().toString().contains(headerArray[i].split("->")[0])) {
            headers.add("Prefer", "example=" + headerArray[i].split("->")[1]);
            break;
          }
        }
      } else {
        if (request.getURI().toString().contains(mainHeader.split("->")[0])) {
          headers.add("Prefer", "example=" + mainHeader.split("->")[1]);
        }
      }
    }
    BufferedOutputStream fop = null;
    try {
      fop = new BufferedOutputStream(new FileOutputStream("E:\\intercept.log",true));
      ClientHttpResponse response = execution.execute(request, body);
      StringBuilder sb = new StringBuilder();
      String line;
      BufferedReader br = new BufferedReader(new InputStreamReader(response.getBody()));
      while ((line = br.readLine()) != null) {
        sb.append(line);
      }
      byte[] contentInBytes = sb.toString().getBytes();
      fop.write(contentInBytes);
      fop.write("\r\n".getBytes());
      fop.flush();
      fop.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fop != null) {
          fop.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return execution.execute(request, body);
  }
}
