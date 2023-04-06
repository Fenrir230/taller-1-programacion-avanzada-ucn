/**
 * @author renato aguilar ramírez  renato.aguilar01@alumnos.ucn.cl 21.278953-4
 * @param args
 *
 *
 *
 */


import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //rango del dibujo
        double min = -1.0;
        double max =  1.0;

        //definicion de la escala del lienzo delo dibujo
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        StdDraw.enableDoubleBuffering();

        //posicion inicial
        //generacion de un par ordenado(x,y)
        //linea 1
        double x0 = min +( max - min ) * Math.random();
        double y0 = min +( max - min ) * Math.random();

        double x1 = min +( max - min ) * Math.random();
        double y1 = min +( max - min ) * Math.random();
        //linea 2
        double x2 = x0 ;
        double y2 = y0 +0.04;

        double x3 = x1 ;
        double y3 = y1 + 0.04;
        //linea 3
        double x4 = x2 ;
        double y4 = y2 +0.04;

        double x5 = x3 ;
        double y5 = y3 + 0.04;

        //linea 4
        double x6 = x4 ;
        double y6 = y4 +0.04;

        double x7 = x5 ;
        double y7 = y5 + 0.04;



        //linea 5
        double x8 = x6 ;
        double y8 = y6 +0.04;

        double x9 = x7 ;
        double y9 = y7 + 0.04;



        //linea 6
        double x10 = x8 ;
        double y10 = y8 +0.04;

        double x11 = x9 ;
        double y11 = y9 + 0.04;


        //velocidad inicial
        //linea 1
        //velocidad 1
        double vx = 0.005 * Math.random();
        double vy = 0.005 * Math.random();
        //velocidad 2
        double vx1 = vx;
        double vy1 = vy;

        //linea 2
        //velocidad 3
        double vx2 = vx;
        double vy2 = vy;
        //velocidad 4
        double vx3 = vx;
        double vy3 = vy;

        //linea 3

        //velocidad 5
        double vx4 = vx;
        double vy4 = vy;

        //velocidad 6
        double vx5 = vx;
        double vy5 = vy;

        //linea 4

        //velocidad 7
        double vx6 = vx;
        double vy6 = vy;

        //velocidad 8
        double vx7 = vx;
        double vy7 = vy;

        //linea 5

        //velocidad 9
        double vx8 = vx;
        double vy8 = vy;

        //velocidad 10
        double vx9 = vx;
        double vy9 = vy;

        //linea 6

        //velocidad 11
        double vx10 = vx;
        double vy10 = vy;
        //velocidad 12
        double vx11 = vx;
        double vy11 = vy;


        //ciclo infinito

        while(true) {

            //colision
            //linea 1
            if (Math.abs(x0+vx) > 1.0 ) {
                vx = -vx;

            }
            if (Math.abs(y0+vy) > 1.0 ) {
                vy = -vy;

            }
            if (Math.abs(x1+vx1) > 1.0 ) {
                vx1 = -vx1;

            }
            if (Math.abs(y1+vy1) > 1.0 ) {
                vy1 = -vy1;

            }
            //linea 2
            if (Math.abs(x2+vx2) > 1.0 ) {
                vx2 = -vx2;

            }
            if (Math.abs(y2+vy2) > 1.0 ) {
                vy2 = -vy2;

            }
            if (Math.abs(x3+vx3) > 1.0 ) {
                vx3 = -vx3;

            }
            if (Math.abs(y3+vy3) > 1.0 ) {
                vy3 = -vy3;

            }
            //linea 3
            if (Math.abs(x4+vx4) > 1.0 ) {
                vx4 = -vx4;

            }
            if (Math.abs(y4+vy4) > 1.0 ) {
                vy4 = -vy4;

            }
            if (Math.abs(x5+vx5) > 1.0 ) {
                vx5 = -vx5;

            }
            if (Math.abs(y5+vy5) > 1.0 ) {
                vy5 = -vy5;

            }
            //linea 4

            if (Math.abs(x6+vx6) > 1.0 ) {
                vx6 = -vx6;

            }
            if (Math.abs(y6+vy6) > 1.0 ) {
                vy6 = -vy6;

            }
            if (Math.abs(x7+vx7) > 1.0 ) {
                vx7 = -vx7;

            }
            if (Math.abs(y7+vy7) > 1.0 ) {
                vy7 = -vy7;

            }

            //linea 5

            if (Math.abs(x8+vx8) > 1.0 ) {
                vx8 = -vx8;

            }
            if (Math.abs(y8+vy8) > 1.0 ) {
                vy8 = -vy8;

            }
            if (Math.abs(x9+vx9) > 1.0 ) {
                vx9 = -vx9;

            }
            if (Math.abs(y9+vy9) > 1.0 ) {
                vy9 = -vy9;

            }

            //linea 6

            if (Math.abs(x10+vx10) > 1.0 ) {
                vx10 = -vx10;

            }
            if (Math.abs(y10+vy10) > 1.0 ) {
                vy10 = -vy10;

            }
            if (Math.abs(x11+vx11) > 1.0 ) {
                vx11 = -vx11;

            }
            if (Math.abs(y11+vy11) > 1.0 ) {
                vy11 = -vy11;

            }




            //actualizacion de posicion
            //linea 1
            x0 += vx;
            y0 += vy;

            x1 += vx1;
            y1 += vy1;
            //linea 2
            x2 += vx2;
            y2 += vy2;

            x3 += vx3;
            y3 += vy3;

            //linea 3
            x4 += vx4;
            y4 += vy4;

            x5 += vx5;
            y5 += vy5;

            //linea 4

            x6 += vx6;
            y6 += vy6;

            x7 += vx7;
            y7 += vy7;

            //linea 5

            x8 += vx8;
            y8 += vy8;

            x9 += vx9;
            y9 += vy9;

            //linea 6

            x10 += vx10;
            y10 += vy10;

            x11 += vx11;
            y11 += vy11;





            //limpiar fondo
            StdDraw.clear();


            //dibujar




            //1ra linea
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x0,y0,x1,y1);
            //2da line
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x2,y2,x3,y3);
            //3ra linea
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x4,y4,x5,y5);
            //4ta linea
            StdDraw.setPenColor(Color.ORANGE);
            StdDraw.line(x6,y6,x7,y7);
            //5ta linea
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(x8,y8,x9,y9);
            //6ta linea
            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.line(x10,y10,x11,y11);



            //mostrar la pantalla y esperar
            StdDraw.show();

            StdDraw.pause(15);

        }


    }

}
