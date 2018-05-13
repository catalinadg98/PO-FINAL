package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArticuloPerecedero a1 = new ArticuloPerecedero("Yogurt", "1111", "lacteos", "$34", "12 de Mayo del 2018");
		ArticuloPerecedero a2 = new ArticuloPerecedero("Leche", "2222", "lacteos", "$11", "13 de Mayo del 2018");
		ArticuloPerecedero a3 = new ArticuloPerecedero("Queso", "3333", "lacteos", "$15", "14 de Mayo del 2018");
		a1.setClave("1111");
		a2.setClave("2222");
		a3.setClave("3333");
		String clave1 = a1.getClave();
		String clave2 = a2.getClave();
		String clave3 = a3.getClave();


		Elemento<ArticuloPerecedero> primero = new Elemento<>(a1);
		Elemento<ArticuloPerecedero> segundo = new Elemento<>(a2);
		Elemento<ArticuloPerecedero> tercero = new Elemento<>(a3);

		ListaArticulo<ArticuloPerecedero> listaA = new ListaArticulo<>();
		listaA.insertar(tercero);
		listaA.insertar(segundo);
		listaA.insertar(primero);
		listaA.eliminar();
		System.out.print(listaA.recorrer());

		System.out.print("Buscar por clave: ");
		Scanner sc = new Scanner(System.in);
		String clave = sc.nextLine();
			if (listaA.recorrer().contains(clave)) {
				System.out.print("DISPONIBLE");
			}else{
				System.out.print("NO DISPONIBLE");
				}
			}
		}