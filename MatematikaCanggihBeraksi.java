/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MTK;

/**
 *
 * @author sypri
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();

        // Uji pertambahan dengan berbagai parameter
        System.out.println("Uji Pertambahan:");
        System.out.println("12 + 28 = " + mc.pertambahan(12, 28));
        System.out.println("12.5 + 28.7 = " + mc.pertambahan(12.5, 28.7));
        System.out.println("12.5 + 28.7 + 14.2 = " + mc.pertambahan(12.5, 28.7, 14.2));
        System.out.println("23 + 34 = " + mc.pertambahan(23, 34));
        System.out.println("3.4 + 4.9 = " + mc.pertambahan(3.4, 4.9));

        // Uji pengurangan
        System.out.println("\nUji Pengurangan:");
        System.out.println("28 - 12 = " + mc.pengurangan(28, 12));
        System.out.println("28.7 - 12.5 = " + mc.pengurangan(28.7, 12.5));

        // Uji perkalian
        System.out.println("\nUji Perkalian:");
        System.out.println("12 * 28 = " + mc.perkalian(12, 28));
        System.out.println("12.5 * 2.5 = " + mc.perkalian(12.5, 2.5));

        // Uji pembagian
        System.out.println("\nUji Pembagian:");
        System.out.println("28 / 12 = " + mc.pembagian(28, 12));
        System.out.println("28.7 / 12.5 = " + mc.pembagian(28.7, 12.5));

        // Uji modulus
        System.out.println("\nUji Modulus:");
        System.out.println("28 % 12 = " + mc.modulus(28, 12));
        System.out.println("28.7 % 12.5 = " + mc.modulus(28.7, 12.5));
    }
}
    
    

