package application;

import java.util.ArrayList;
import java.util.List;

public class LinhaAerea {
	private ArrayList<Voo> voos = new ArrayList<Voo>();
	private ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
	private ArrayList<Bilhete<String>> bilhetes = new ArrayList<Bilhete<String>>();
	
	public void iniciar() {
		
		Endereco e1 = new Endereco("Rua 1",123,
				"Monte Carlo","CG","79022123");
		Endereco e2 = new Endereco("Rua 2",124,
				"Monte Castelo","CG","79022124");
		Endereco e3 = new Endereco("Rua 3",125,
				"Monte Caro","CG","79022125");
		Endereco e4 = new Endereco("Rua 4",126,
				"Monte Cutelo","CG","79022126");
		Endereco e5 = new Endereco("Rua 5",127,
				"Monte Cautelo","CG","79022127");
		Endereco e6 = new Endereco("Rua 6",128,
				"Monte Camelo","CG","79022128");
		
		
		Aeroporto a1 = new Aeroporto("A1Z",e2);
		Aeroporto a2 = new Aeroporto("A2Z",e2);
		Aeroporto a3 = new Aeroporto("A3Z",e3);
		Aeroporto a4 = new Aeroporto("A4Z",e3);
		
		
		CompanhiaAerea ca1 = new CompanhiaAerea("0001","Amarelo");//Azul
		CompanhiaAerea ca2 = new CompanhiaAerea("0002","Cobrin");//Latam
		CompanhiaAerea ca3 = new CompanhiaAerea("0003","Falta");//Gol
		CompanhiaAerea ca4 = new CompanhiaAerea("0004","Brasileirao");//Copa Airlines
		
		Voo v1 = new Voo("122",a1,a2,Horario.novo_DataHora(1,1,2001,14,30,00),
				Horario.novo_DataHora(1,1,2001,18,30,00),100);
		Voo v2 = new Voo("133",a1,a3,Horario.novo_DataHora(1,1,2001,14,30,00),
				Horario.novo_DataHora(1,1,2001,18,30,00),100);
		Voo v3 = new Voo("144",a4,a1,Horario.novo_DataHora(1,1,2001,14,30,00),
				Horario.novo_DataHora(1,1,2001,18,30,00),100);
		Voo v4 = new Voo("155",a4,a2,Horario.novo_DataHora(1,1,2001,14,30,00),
				Horario.novo_DataHora(1,1,2001,18,30,00),100);
		
		voos.add(v1);
		voos.add(v2);
		voos.add(v3);
		voos.add(v4);
		
		Passageiro p1 = new Passageiro("Claudio","01234567899","0123456", e1,"67992641136","01/01/2001","123456");
		Passageiro p2 = new Passageiro("Cleber","01234567889","0123456", e2,"67992641136","01/02/2001","123456");
		Passageiro p3 = new Passageiro("Claudemir","01234567879","0123456", e1,"67992641136","01/03/2001","123456");
		Passageiro p4 = new Passageiro("Claudomiro","01234567869","0123456", e3,"67992641136","01/04/2001","123456");
		Passageiro p5 = new Passageiro("Cleopatra","01234567859","0123456", e3,"67992641136","01/05/2001","123456");
		Passageiro p6 = new Passageiro("Claudinei","01234567849","0123456", e1,"67992641136","01/06/2001","123456");
		Passageiro p7 = new Passageiro("Claudionor","01234567839","0123456", e4,"67992641136","01/07/2001","123456");
		Passageiro p8 = new Passageiro("Claudia","01234567829","0123456", e1,"67992641136","01/08/2001","123456");
		Passageiro p9 = new Passageiro("Clodovaldo","01234567819","0123456", e4,"67992641136","09/01/2001","123456");
		Passageiro p10 = new Passageiro("Clara","01234567809","0123456", e1,"67992641136","01/10/2001","123456");
		
		passageiros.add(p1);
		passageiros.add(p2);
		passageiros.add(p3);
		passageiros.add(p4);
		passageiros.add(p5);
		passageiros.add(p6);
		passageiros.add(p7);
		passageiros.add(p8);
		passageiros.add(p9);
		passageiros.add(p10);
		
		Passagem ps1 = new Passagem("1",v1,v4,p1,"A1");
		Passagem ps2 = new Passagem("2",v2,v3,p2,"A2");
		Passagem ps3 = new Passagem("3",v2,v2,p3,"B5");
		Passagem ps4 = new Passagem("4",v1,v2,p4,"C7");
		Passagem ps5 = new Passagem("5",v1,v1,p5,"I8");
		Passagem ps6 = new Passagem("6",v2,v2,p6,"A3");
		Passagem ps7 = new Passagem("7",v3,v4,p7,"G3");
		Passagem ps8 = new Passagem("8",v3,v3,p8,"A4");
		Passagem ps9 = new Passagem("9",v4,v2,p9,"V1");
		Passagem ps10 = new Passagem("10",v4,v1,p10,"X1");
		
		List<Passagem> l1 = new ArrayList<Passagem>();
		List<Passagem> l2 = new ArrayList<Passagem>();
		List<Passagem> l3 = new ArrayList<Passagem>();
		List<Passagem> l4 = new ArrayList<Passagem>();
		
		l1.add(ps1);
		l1.add(ps2);
		
		l2.add(ps3);
		l2.add(ps4);
		
		l3.add(ps5);
		l3.add(ps6);
		
		l4.add(ps7);
		l4.add(ps8);
		l4.add(ps9);
		l4.add(ps10);
		
		Bilhete<String> b1 = new Bilhete<String>("45AV87",l1,10.000,ca1);
		Bilhete<String> b2 = new Bilhete<String>("56ZV74",l2,11.000,ca2);
		Bilhete<String> b3 = new Bilhete<String>("33AV85",l3,20.000,ca3);
		Bilhete<String> b4 = new Bilhete<String>("12XV20",l4,30.000,ca4);
		
		bilhetes.add(b1);
		bilhetes.add(b2);
		bilhetes.add(b3);
		bilhetes.add(b4);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		}

	public ArrayList<Voo> getVoos() {
		return voos;
	}

	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	
	public ArrayList<Bilhete<String>> getBilhetes() {
		return bilhetes;
	}
		
}
