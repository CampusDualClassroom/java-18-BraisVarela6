package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;
import java.util.List;


public class Exercise18 {

	protected static int[] createAndInitializeArray(int num) {
        int[] intArray = new int[num];
		int i;
        for (i = 0 ; i < num; i++) {
			intArray[i] = i + 1; // cambiando num seleccionas que genere numeros entre 1 y "lo que pongas en vez de num"
		}
        return intArray;
    }

	protected static void showInlineArray(int [] arrays){
		//Utils.integer("Introduce el Array que quieres mostrar")
		//int[] array = {1, 2, 3};
		for (int n = 0; n < arrays.length; n++){
			System.out.print(arrays[n]);
			if (n < arrays.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] intArray1 = createAndInitializeArray(Utils.integer("Introduce el número de valores que quieres que contenga el Array: "));

		int[] intArray2 = createAndInitializeArray(Utils.integer("Introduce el número de valores que quieres que contenga el Array: "));

		System.out.println("Mostrando el primer array");
		showInlineArray(intArray1);

		System.out.println("Mostrando el segundo array");
		showInlineArray(intArray2);

	}
}
