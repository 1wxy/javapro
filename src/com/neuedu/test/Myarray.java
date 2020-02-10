package com.neuedu.test;

public class Myarray {
    private int[] array;
    private int size;
    public Myarray(){
        size=0;
        array=new int[10];
    }

    public int getSize() {
        return size;
    }
    public void add(int i){
        if (size>=array.length){
            int[] newarray=new int[size+size/2];
            for (int j=0;j<array.length;j++){
                newarray[j]=array[j];
            }
            array=newarray;
            System.out.println("新数组长度"+array.length);
        }
        array[size++]=i;
    }
}
