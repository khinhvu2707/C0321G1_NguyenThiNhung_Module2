package manager.cinema;

import commons.WriteAndReadMovie;
import commons.WriteAndReadTickket;
import models.Movie;

import java.io.IOException;
import java.util.*;

public class ShowTickket {
        public static void showTickket() throws IOException {
        List<Movie> resultMovie;
        resultMovie = WriteAndReadMovie.readMovie();

        String tickket = WriteAndReadTickket.readTickket();
        String[] strings = tickket.split("_");
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        Queue<String> queue3 = new ArrayDeque<>();
        Queue<String> queue4 = new ArrayDeque<>();
        Queue<String> queue5 = new ArrayDeque<>();
        String[] nameMovie = new String[5];
        String[] nameCustomer = new String[strings.length / 2];
        String[] nameBuyMovie = new String[strings.length / 2];

        //tên phim mua
        int a = 0;
        for (int i = 2; i < strings.length; i += 2) {
            nameBuyMovie[a] = strings[i];
            a++;
        }
        //tên người mua
        int b = 0;
        for (int i = 1; i < strings.length; i += 2) {
            nameCustomer[b] = strings[i];
            b++;
        }
        //tên film gốc
        int c = 0;
        for (Movie movie : resultMovie) {
            nameMovie[c] = movie.getName();
            c++;
        }

        System.out.println("--oOo-- Phim " + nameMovie[0] + "--oOo--");
        for (int i = 0; i < nameBuyMovie.length; i++) {
            if (nameBuyMovie[i].equals(nameMovie[0])) {
                queue1.offer(nameCustomer[i]);
            }
        }
        int length = queue1.size();
        for (int i = 0; i < length; i++) {
            System.out.println("***Chỗ ngồi số : " + (i + 1) + " của Khách hàng:");
            System.out.println(queue1.remove());

        }

        System.out.println("--oOo-- Phim " + nameMovie[1] + "--oOo--");
        for (int i = 0; i < nameBuyMovie.length; i++) {
            if (nameBuyMovie[i].equals(nameMovie[1])) {
                queue2.offer(nameCustomer[i]);
            }
        }
        int length2 = queue2.size();
        for (int i = 0; i < length2; i++) {
            System.out.println("***Chỗ ngồi số : " + (i + 1) + " của Khách hàng:");
            System.out.println(queue2.remove());

        }
        System.out.println("--oOo-- Phim " + nameMovie[2] + "--oOo--");
        for (int i = 0; i < nameBuyMovie.length; i++) {
            if (nameBuyMovie[i].equals(nameMovie[2])) {
                queue3.offer(nameCustomer[i]);
            }
        }
        int length3 = queue3.size();
        for (int i = 0; i < length3; i++) {
            System.out.println("***Chỗ ngồi số : " + (i + 1) + " của Khách hàng:");
            System.out.println(queue3.remove());

        }
        System.out.println("--oOo-- Phim " + nameMovie[3] + "--oOo--");
        for (int i = 0; i < nameBuyMovie.length; i++) {
            if (nameBuyMovie[i].equals(nameMovie[3])) {
                queue4.offer(nameCustomer[i]);
            }
        }
        int length4 = queue4.size();
        for (int i = 0; i < length4; i++) {
            System.out.println("***Chỗ ngồi số : " + (i + 1) + " của Khách hàng:");
            System.out.println(queue4.remove());

        }
        System.out.println("--oOo-- Phim " + nameMovie[4] + "--oOo--");
        for (int i = 0; i < nameBuyMovie.length; i++) {
            if (nameBuyMovie[i].equals(nameMovie[4])) {
                queue5.offer(nameCustomer[i]);
            }
        }
        int length5 = queue5.size();
        for (int i = 0; i < length5; i++) {
            System.out.println("***Chỗ ngồi số : " + (i + 1) + " của Khách hàng:");
            System.out.println(queue5.remove());

        }
    }
    }

