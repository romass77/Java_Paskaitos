package lt.bit;

import java.util.Scanner;

public class MariausSaldainiai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Marius gauna saldainiu i diena:");
        int gaunaSaldainiu = sc.nextInt();

        System.out.println("Kiek saldainiu suvalgo i diena:");
        int suvalgoSaldainiu = sc.nextInt();

        System.out.println("Iki kaliedu liko:");
        int ikiKalieduLiko= sc.nextInt();

int visoSaldainiu = (gaunaSaldainiu - suvalgoSaldainiu) * ikiKalieduLiko;
int drauguSkaicius = visoSaldainiu / suvalgoSaldainiu;
int liksNesupakuota = visoSaldainiu - suvalgoSaldainiu * drauguSkaicius;

        System.out.println("Marius dovanas paruos "+drauguSkaicius+" draugu.");
        System.out.println("Supakavus dovanas liks "+liksNesupakuota+" saldainia.");

    }
}