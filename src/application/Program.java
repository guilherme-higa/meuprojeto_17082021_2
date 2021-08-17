package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> produto = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.println("Dados do produto #" + (i + 1) + ":");
			System.out.print("Comum, usado ou importado (c/u/i) ? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Customs fee:");
				double fee = sc.nextDouble();
				produto.add(new ImportedProduct(nome, preco, fee));
			}
			if (tipo == 'u') {
				System.out.print("Data da fabricação: ");
				Date data_fabricacao = sdf.parse(sc.next());
				produto.add(new UsedProduct(nome, preco, data_fabricacao));
			}
			if (tipo == 'c') {
				produto.add(new Product(nome, preco));
			}
		}
		System.out.println();
		System.out.println("Preço das TAGS:");
		for (Product x : produto) {
			System.out.println(x);
		}
		sc.close();
	}

}
