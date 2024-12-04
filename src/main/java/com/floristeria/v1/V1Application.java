package com.floristeria.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.floristeria.v1.entidades.Arreglo;
import com.floristeria.v1.repositorios.arregloRepositorio;

@SpringBootApplication
public class V1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(V1Application.class, args);
	}

	@Autowired
	private arregloRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {

		Arreglo arreglo1 = new Arreglo("Rosas Elegantes",
				"Doce rosas rojas frescas con follaje verde y un lazo decorativo", "75000");
		repositorio.save(arreglo1);

		Arreglo arreglo2 = new Arreglo("Primavera Viva",
				"Mezcla de flores primaverales como girasoles, margaritas y lilas en un elegante florero", "95000");
		repositorio.save(arreglo2);

		Arreglo arreglo3 = new Arreglo("Sueños Blancos",
				"Arreglo con lirios blancos, hortensias y detalles en tonos crema",
				"110000");
		repositorio.save(arreglo3);

		Arreglo arreglo4 = new Arreglo("Pasión Tropical",
				"Exótico arreglo con heliconias, anturios y follaje tropical", "125000");
		repositorio.save(arreglo4);

		Arreglo arreglo5 = new Arreglo("Amor Pastel",
				"Combinación de rosas pastel, tulipanes y claveles en una canasta rústica",
				"89000");
		repositorio.save(arreglo5);

		Arreglo arreglo6 = new Arreglo("Luz del Campo",
				"Arreglo campestre con girasoles, margaritas y flores silvestres", "68000");
		repositorio.save(arreglo6);

		Arreglo arreglo7 = new Arreglo("Romance Clásico",
				"Rosas rojas en forma de corazón, ideales para una ocasión romántica",
				"120000");
		repositorio.save(arreglo7);

		Arreglo arreglo8 = new Arreglo("Armonía de Colores",
				"Arreglo multicolor con flores variadas para alegrar cualquier espacio",
				"78000");
		repositorio.save(arreglo8);

		Arreglo arreglo9 = new Arreglo("Elegancia Púrpura",
				"Lirios, orquídeas y flores lilas en un moderno diseño vertical", "115000");
		repositorio.save(arreglo9);

		Arreglo arreglo10 = new Arreglo("Amanecer Dorado",
				"Arreglo con tonos cálidos, incluyendo girasoles y rosas amarillas",
				"97000");
		repositorio.save(arreglo10);

	}

}
