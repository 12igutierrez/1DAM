package Clase2;

public class main {

	public static void main(String[] args) {
		PrismaPentagonal prisma = new PrismaPentagonal();
		System.out.println(prisma.altura);
		
		prisma.calcularAreaBase();
		System.out.println(prisma.area_base);
		
		prisma.calcularAreaLateral();
		System.out.println(prisma.area_lateral);
		
		prisma.areaTotal();
		System.out.println(prisma.areaTotal());
		
		prisma.volumen();
		System.out.println(prisma.volumen());
		
		prisma.volumen(2,3);
		System.out.println(prisma.volumen(2, 3));

	}

}
