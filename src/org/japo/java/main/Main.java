/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final String NOMBRE_PERSONA = "Jaimito";
        final String NOMBRE_ENCARGO = "Patatas";
        final String NOMBRE_ANTOJO = "Piruleta";
        final double PRECIO_PATATA = 0.30;
        final double PRECIO_PIRULETA = 0.20;
        final double CANTIDAD_INICIAL = 1.00;
        //Variables
        double cantidadDineroFinal;
        int cantidadPatatas = 3;
        double restoDinero;
        //Cabecera
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        //Mensajes
        System.out.printf("Persona encargada .....: %s%n", NOMBRE_PERSONA);
        System.out.printf("Artículo encargado ....: %s%n", NOMBRE_ENCARGO);
        System.out.printf("Cantidad encargada ....: %d kg %n", cantidadPatatas);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/kg %n",
                PRECIO_PATATA);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f € %n",
                CANTIDAD_INICIAL);
        System.out.println("---");
        System.out.printf("Artículo imprevisto ...: %s%n", NOMBRE_ANTOJO);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f € %n",
                PRECIO_PIRULETA);
        System.out.println("---");
        //Calculos
        cantidadDineroFinal = CANTIDAD_INICIAL - PRECIO_PIRULETA;
        cantidadPatatas = (int) (cantidadDineroFinal / PRECIO_PATATA);
        System.out.printf("Cantidad comprada .....: %d kg %n", cantidadPatatas);
        //calculo del resto
        restoDinero = cantidadDineroFinal % PRECIO_PATATA;
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f € %n",
                restoDinero);
    }
}
