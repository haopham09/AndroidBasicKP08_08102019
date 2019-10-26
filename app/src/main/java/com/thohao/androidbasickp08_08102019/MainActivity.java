package com.thohao.androidbasickp08_08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] arrayNumber = {1,10,11,20,18,19,21,10};
        //tinh tong gia tri trong mang
        int sum=0;
        for(int number : arrayNumber){
            sum+=number;

        }
        Log.d("BBB","SUM: "+sum);
        //Arrays.sort(arrayNumber);
        /*for(int number2 : arrayNumber){
            Log.d("BBB", String.valueOf(number2));
        }*/
        Log.d("BBB",Arrays.toString(arrayNumber));

        //tìm kiem chỉ số mot giá trị trong mảng
        int index=Arrays.binarySearch(arrayNumber,10);
        if(index<0){
            Log.d("BBB","-1");
        }else{
            Log.d("BBB","Tim thay 10 tai "+index);
        }
        //int []arrayNumber2=new int[10];
        //Vector<String>arrNumber2= new Vector();
        List<Integer>arrNumber2=new ArrayList<Integer>();
        for(int element : arrayNumber){
                if(!arrNumber2.contains(element)){
                    arrNumber2.add(element);
                }
        }

        Log.d("BBB","Đã xóa Phần tử bị trùng trong mảng: "+arrNumber2.toString());


    }
}
