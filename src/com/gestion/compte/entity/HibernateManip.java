package com.gestion.compte.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManip {

	public static void main(String[] args) {
		
		// session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Agence.class)
								.addAnnotatedClass(Client.class)
								.addAnnotatedClass(Compte.class)
								.addAnnotatedClass(Operation.class)
								.buildSessionFactory();
		
		
		// session
		Session session = factory.getCurrentSession();
		
		try {
			// crer un objet Agence
		    Agence temAgence = new Agence("SG Berlin", "11 rue du dr Blanche");
		/*	Client tempClient = new Client("Bairi", "Radia","7 rue les chenes d'or", temAgence);
			Compte tempCompte= new Compte("1452621", "perso", "DB", 20000,tempClient);
			*/
			
			
			
			// debut de la trasaction
			session.beginTransaction();
			
			// save (enregistrement dans la db)
			session.save(temAgence);
		/*	session.save(tempClient);
			session.save(tempCompte);
			*/
			// commit dans la db
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
