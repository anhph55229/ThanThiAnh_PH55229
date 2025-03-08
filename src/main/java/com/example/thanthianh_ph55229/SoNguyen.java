package com.example.thanthianh_ph55229;

public class SoNguyen {

    public int SoNguyen(int arr[]){
        if(arr.length == 0 || arr == null){
            throw new IllegalArgumentException("Mang khong duoc trong");
        }

        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0 && arr[i] % 6 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
