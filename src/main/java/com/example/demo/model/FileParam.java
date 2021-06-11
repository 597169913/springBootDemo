package com.example.demo.model;


/**
 * 路径参数
 */
public class FileParam {


    /**
     * 文件名称
     */
    private String filename;

    /**
     * 文件路径
     */
    private String path;

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public String getPath() {
        return path;
    }
}
