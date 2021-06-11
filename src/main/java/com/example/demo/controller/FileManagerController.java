package com.example.demo.controller;

import com.example.demo.model.FileParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
@RequestMapping("/rest/fileManager")
public class FileManagerController {
   @Value("${com.example.demo.baseUploadPath}")
    private String baseUploadPath;

   @RequestMapping(method = RequestMethod.GET, value="/createFile")
   public void createFile(@RequestBody FileParam fileParam) {
      File file = new File(baseUploadPath);
       if (!file.exists()) {
           file.mkdirs();
       }
      if (file.isDirectory()) {
         File[] files = file.listFiles();
          System.out.println(files);
      } else {

      }
   }
    @RequestMapping(method = RequestMethod.GET, value="/renameFile")
    public void renameFile() {

    }
    @RequestMapping(method = RequestMethod.GET, value="/deleteFile")
    public void deleteFile() {

    }
    @RequestMapping(method = RequestMethod.GET, value="/uploadFile")
    public void uploadFile() {

    }
    @RequestMapping(method = RequestMethod.GET, value="/getFiles")
    public void getFiles() {

    }
    @RequestMapping(method = RequestMethod.GET, value="/download")
    public void download() {

    }
}
