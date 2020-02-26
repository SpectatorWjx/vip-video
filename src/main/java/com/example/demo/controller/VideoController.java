package com.example.demo.controller;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
@Controller
@RequestMapping("/video")
public class VideoController {

    @RequestMapping("/tips")
    public String getTips(){
        return "tips";
    }

    @RequestMapping("/qrCode")
    public void getErWeiMa(HttpServletResponse response){


        String qrtext = "http://spectatorwjx.club/video/qrCodeResult";

        ByteArrayOutputStream out = QRCode.from(qrtext).to(ImageType.PNG).stream();

        response.setContentType("image/png");
        response.setContentLength(out.size());

        OutputStream outStream = null;
        try {
            outStream = response.getOutputStream();

            outStream.write(out.toByteArray());

            outStream.flush();
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/qrCodeResult")
    public String getErWeiMa(){
        return "QRCode";
    }
}