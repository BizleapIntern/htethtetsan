package com.bizleap.training.assignment.two;

import java.io.File;


public class ListfileUtil
{
    public static void main(String[] args) {
        ListfileUtil listfileUtil=new ListfileUtil();
        final String directory="C:\\Intel";
        listfileUtil.listFilesAndFilesSubDirectories(directory);

    }
    public void listFilesAndFilesSubDirectories(String directoryName){
        File directory =new File(directoryName);
        File[] fileList=directory.listFiles();
        for (File file: fileList){
            if (file.isFile()){
                System.out.println("  <FileName>");
                System.out.println("    "+file.getName());
            }
            else if (file.isDirectory()){
                System.out.println("<Directory>");
                System.out.println(file.getAbsolutePath());
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }
}
