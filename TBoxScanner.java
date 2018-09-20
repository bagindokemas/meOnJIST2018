package $owlapi.tutorial.msc;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import uk.ac.manchester.cs.jfact.JFactFactory;

/*
 Script that do TBoxScanner.
  */
public class TBoxScanner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws OWLOntologyCreationException, IOException {
		long startTime = System.nanoTime();
		//Load the ontologies
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		File file = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/ontologies/NELL.ontology.ttl");
		OWLOntology ont = man.loadOntologyFromOntologyDocument(file);

		OWLReasonerFactory rf = new JFactFactory();
		OWLReasoner reasoner = rf.createReasoner(ont);
		OWLDataFactory factory = man.getOWLDataFactory();
		String Prop = new String();
		String domainProp = new String();
		String Range = new String();
		String rangeProp = new String();
		File file1 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX1.txt");
		FileWriter fw1 = new FileWriter(file1);
		PrintWriter printWriter1 = new PrintWriter(fw1);
		File file2 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX2.txt");
		FileWriter fw2 = new FileWriter(file2);
		PrintWriter printWriter2 = new PrintWriter(fw2);
		//PrintWriter 3 menghasilkan file PrecomputeTBOX3 yang bisa digunakan untuk pattern ID 3.
		File file3 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX3.txt");
		FileWriter fw3 = new FileWriter(file3);
		PrintWriter printWriter3 = new PrintWriter(fw3);
		File file4 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX4.txt");
		FileWriter fw4 = new FileWriter(file4);
		PrintWriter printWriter4 = new PrintWriter(fw4);		
		File file5 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX5.txt");
		FileWriter fw5 = new FileWriter(file5);
		PrintWriter printWriter5 = new PrintWriter(fw5);
		File file6 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX6.txt");
		FileWriter fw6 = new FileWriter(file6);
		PrintWriter printWriter6 = new PrintWriter(fw6);
		File file7 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX7.txt");
		FileWriter fw7 = new FileWriter(file7);			
		PrintWriter printWriter7 = new PrintWriter(fw7);
		File file8 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX8.txt");
		FileWriter fw8 = new FileWriter(file8);
		PrintWriter printWriter8 = new PrintWriter(fw8);
		File file9 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX9.txt");
		FileWriter fw9 = new FileWriter(file9);
		PrintWriter printWriter9 = new PrintWriter(fw9);
		File file10 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX10.txt");
		FileWriter fw10 = new FileWriter(file10);
		PrintWriter printWriter10 = new PrintWriter(fw10);
		File file11 = new File("/home/ktgroup/workspaceJan18/OWLAPIKem/msc/resultTest/NELL4JIST18/PrecomputeTBOX11.txt");
		FileWriter fw11 = new FileWriter(file11);
		PrintWriter printWriter11 = new PrintWriter(fw11);
		
		String domainSuper = new String();
		
		for(OWLObjectPropertyDomainAxiom doma: ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)){
			//Prop = doma.getProperty().getNamedProperty().getIRI().getShortForm();
			Prop = doma.getProperty().getNamedProperty().toString();
			domainProp = doma.getDomain().toString();
			NodeSet<OWLClass> sof = reasoner.getDisjointClasses(doma.getDomain());
			printWriter1.print(Prop+"\t"+domainProp+"\t");
			//printWriter1.print(Prop+"\t");
	        for(OWLClass ox : sof.getFlattened()){  		
	        	//printWriter1.print(ox.getIRI().getShortForm()+"\"");
	        	printWriter1.print(ox.toString()+"\"");
	        	}
	       printWriter1.println();
	        	
			}
		printWriter1.close();
		
		for(OWLObjectPropertyRangeAxiom rang: ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)){
			//Range = rang.getProperty().getNamedProperty().getIRI().getShortForm();
			Range = rang.getProperty().getNamedProperty().toString();
			rangeProp = rang.getRange().toString();
			NodeSet<OWLClass> sof3 = reasoner.getDisjointClasses(rang.getRange());
			printWriter2.print(Range+"\t"+rangeProp+"\t");
			//printWriter2.print(Range+"\t");
	        for(OWLClass ox : sof3.getFlattened()){  		
	        	printWriter2.print(ox.toString()+"\"");
	        	//untuk IBM menggunakan short form, untuk dbpedia full url
	        	//printWriter2.print(ox.toString()+"\"");
	        	}
	       printWriter2.println();
	        	
			}
		printWriter2.close();
			
		for(OWLObjectProperty prop : ont.getObjectPropertiesInSignature()){ 
			NodeSet<OWLObjectPropertyExpression> properties = reasoner.getSubObjectProperties(prop, false);
			//if the size == 1, it means the property does not have any subobject property.
			if(properties.getNodes().size()>1){				
				String domaSup = new String();		
				String relations = new String();
				for (OWLObjectPropertyDomainAxiom op : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {                           
	                if(op.getProperty().equals(prop.getNamedProperty())) {					
	                	//System.out.print(op.getProperty().toString()+"\t");
	                	//System.out.println(op.getDomain().toString());
	                	relations  = op.getProperty().toString();
	                	domaSup = op.getDomain().toString();
	                	domaSup = domaSup.substring(1,domaSup.length()-1);
	                }										                
	            }
				String check = new String();
				java.util.Iterator<Node<OWLObjectPropertyExpression>> itr = properties.getNodes().iterator();
				while(itr.hasNext()) {											
					//SubProps[0] berisikan subProperty dari Property prop
					//akses elemen pertama dari subproperty				
					//String[] subProps = properties.getNodes().iterator().next().toString().split("InverseOf");
					//before splitting based on InverseOf, check whether itr contains only Node( owl:bottomObjectProperty )]
					check = itr.next().toString();					
					if(!(check.contentEquals("Node( owl:bottomObjectProperty )"))) {
						//working only for the ontology that has Inverse in the text file for each property
						String domaSub1 = new String();
						if(check.contains("InverseOf")){													
							String[] subProps = check.split("InverseOf");						
																
							if(subProps[0].length()<8) {
								//if list subproperty dimulai dari inverse dulu, maka penanganannya sbb:
								String[] temp = subProps[1].split("\\) ");
								//temp[1] adalah nama subproperty yang dicari.
								//untuk pattern 3,4 harus dicek dulu apakah temp1 punya http atau tidak ?
								//kalau punya http code berikut bisa jalan, kalau tidak cari cara lain
								//kalau temp[1] tidak memiliki http berarti bukan subproperty yang penting utk diproses
								if(temp[1].contains("http"))
								{									
									temp[1]=temp[1].substring(1,temp[1].length()-3);								
									OWLObjectProperty opry = factory.getOWLObjectProperty(IRI.create(temp[1]));
									for (OWLObjectPropertyDomainAxiom opsi : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {                           
										if(opsi.getProperty().equals(opry)) {
											//System.out.print(opsi.getProperty().toString()+"\t");
											//System.out.print(opsi.getDomain().toString());
											//System.out.println();
											domaSub1 = opsi.getDomain().toString();
											domaSub1 = domaSub1.substring(1,domaSub1.length()-1);
											OWLClass oSup = factory.getOWLClass(IRI.create(domaSup));
											OWLClass oSub1 = factory.getOWLClass(IRI.create(domaSub1));
											//jika Osup dan Osub1 berbeda stringnya, baru dicheck sama reasoner
											if(!(oSup.toString().equals(oSub1.toString()))) 
											{
											 OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub1));
											 boolean classesAreDisjoint = reasoner.isEntailed(axiom);
											 if (classesAreDisjoint) 
											 {
												//printWriter3.println(relations);
												printWriter3.println(opry.toString());
											 }
											}
										}
									}
								}
							}//end dari if(subProps[0].length()<8)
							else 
							{
								String domaSub = new String();
								String[] subPropx = subProps[0].split("Node\\( ");	
								//remove the character < di awal dan > di akhir string
								subPropx[1] = subPropx[1].substring(1,subPropx[1].length()-2); 
								OWLObjectProperty oprx = factory.getOWLObjectProperty(IRI.create(subPropx[1]));
								for (OWLObjectPropertyDomainAxiom ops : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {                           
									if(ops.getProperty().equals(oprx)) {
										//System.out.print(ops.getProperty().toString()+"\t");
										//System.out.print(ops.getDomain().toString());
										//System.out.println();
										domaSub = ops.getDomain().toString();
										domaSub = domaSub.substring(1,domaSub.length()-1);
										OWLClass oSup = factory.getOWLClass(IRI.create(domaSup));
										OWLClass oSub = factory.getOWLClass(IRI.create(domaSub));
										if(!(oSup.toString().equals(oSub.toString()))) 
										{
										  OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub));
										  boolean classesAreDisjoint = reasoner.isEntailed(axiom);
										  if (classesAreDisjoint) 
										  {
											//printWriter3.println(relations);
											printWriter3.println(oprx.toString());
										  }
										}
									}
								}
							}
						}//if(check.contains("InverseOf"))
						else 
						{
							//jika check tidak ada InverseOf							
							String domaSub = new String();
							String[] subPropx = check.split("Node\\( ");	
							//remove the character < di awal dan > di akhir string
							subPropx[1] = subPropx[1].substring(1,subPropx[1].length()-3); 
							OWLObjectProperty oprx = factory.getOWLObjectProperty(IRI.create(subPropx[1]));
							for (OWLObjectPropertyDomainAxiom ops : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {                           
								if(ops.getProperty().equals(oprx)) {
									//System.out.print(ops.getProperty().toString()+"\t");
									//System.out.print(ops.getDomain().toString());
									//System.out.println();
									domaSub = ops.getDomain().toString();
									domaSub = domaSub.substring(1,domaSub.length()-1);
									OWLClass oSup = factory.getOWLClass(IRI.create(domaSup));
									OWLClass oSub = factory.getOWLClass(IRI.create(domaSub));
									if(!(oSup.toString().equals(oSub.toString()))) 
									{
										OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub));
										boolean classesAreDisjoint = reasoner.isEntailed(axiom);
										if (classesAreDisjoint) 
										{
											printWriter3.println(oprx.toString());
											//printWriter3.println(relations);
										}
									}
								}
							}
						}
					}//end dari if(!(check.contentEquals("Node( owl:bottomObjectProperty )")))
				}
			}			
		}
		printWriter3.close();

		for(OWLObjectProperty prop : ont.getObjectPropertiesInSignature()){ 
			NodeSet<OWLObjectPropertyExpression> properties = reasoner.getSubObjectProperties(prop, false);
			//if the size == 1, it means the property does not have any subobject property.
			if(properties.getNodes().size()>1){				
				String rangeSup = new String();		
				String relations = new String();
				for (OWLObjectPropertyRangeAxiom op : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {                           
	                if(op.getProperty().equals(prop.getNamedProperty())) {					
	                	//System.out.print(op.getProperty().toString()+"\t");
	                	//System.out.println(op.getDomain().toString());
	                	relations  = op.getProperty().toString();
	                	rangeSup = op.getRange().toString();
	                	rangeSup = rangeSup.substring(1,rangeSup.length()-1);
	                }										                
	            }
				String check = new String();
				java.util.Iterator<Node<OWLObjectPropertyExpression>> itr = properties.getNodes().iterator();
				while(itr.hasNext()) {											
					//SubProps[0] berisikan subProperty dari Property prop
					//akses elemen pertama dari subproperty				
					//String[] subProps = properties.getNodes().iterator().next().toString().split("InverseOf");
					//before splitting based on InverseOf, check whether itr contains only Node( owl:bottomObjectProperty )]
					check = itr.next().toString();
					System.out.println("Cek " +check);
					if(!(check.contentEquals("Node( owl:bottomObjectProperty )"))) {
						//working only for the ontology that has Inverse of for each property
						String rangeSub1 = new String();
						if(check.contains("InverseOf")){													
							String[] subProps = check.split("InverseOf");						
																
							if(subProps[0].length()<8) {
								//if list subproperty dimulai dari inverse dulu, maka penanganannya sbb:
								String[] temp = subProps[1].split("\\) ");
								//temp[1] adalah nama subproperty yang dicari.
								if(temp[1].contains("http"))
								{
									temp[1]=temp[1].substring(1,temp[1].length()-3);								
									OWLObjectProperty opry = factory.getOWLObjectProperty(IRI.create(temp[1]));
									for (OWLObjectPropertyRangeAxiom opsi : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {                           
										if(opsi.getProperty().equals(opry)) {										
											rangeSub1 = opsi.getRange().toString();
											rangeSub1 = rangeSub1.substring(1,rangeSub1.length()-1);
											OWLClass oSup = factory.getOWLClass(IRI.create(rangeSup));
											OWLClass oSub1 = factory.getOWLClass(IRI.create(rangeSub1));
											if(!(oSup.toString().equals(oSub1.toString()))) 
											{
											   OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub1));
											   boolean classesAreDisjoint = reasoner.isEntailed(axiom);
											   if (classesAreDisjoint) 
											   {
												printWriter4.println(relations);
											   }
											}
										}
									}							
								}
							}	
							else 
							{
								String rangeSub = new String();
								String[] subPropx = subProps[0].split("Node\\( ");	
								//remove the character < di awal dan > di akhir string
								subPropx[1] = subPropx[1].substring(1,subPropx[1].length()-2); 
								OWLObjectProperty oprx = factory.getOWLObjectProperty(IRI.create(subPropx[1]));
								for (OWLObjectPropertyRangeAxiom ops : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {                           
									if(ops.getProperty().equals(oprx)) {
										//System.out.print(ops.getProperty().toString()+"\t");
										//System.out.print(ops.getDomain().toString());
										//System.out.println();
										rangeSub = ops.getRange().toString();
										rangeSub = rangeSub.substring(1,rangeSub.length()-1);
										OWLClass oSup = factory.getOWLClass(IRI.create(rangeSup));
										OWLClass oSub = factory.getOWLClass(IRI.create(rangeSub));
										if(!(oSup.toString().equals(oSub.toString()))) 
										{
										   OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub));
										   boolean classesAreDisjoint = reasoner.isEntailed(axiom);
										   if (classesAreDisjoint) 
										   {
											 printWriter4.println(relations);
										   }
										}
									}
								}
							}
						}//if(check.contains("InverseOf"))
						else 
						{
							//jika check tidak ada InverseOf
							//perlu didebugging lagi belum masuk kesini...
							String rangeSub = new String();
							String[] subPropx = check.split("Node\\( ");	
							//remove the character < di awal dan > di akhir string
							subPropx[1] = subPropx[1].substring(1,subPropx[1].length()-3); 
							OWLObjectProperty oprx = factory.getOWLObjectProperty(IRI.create(subPropx[1]));
							for (OWLObjectPropertyRangeAxiom ops : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {                           
								if(ops.getProperty().equals(oprx)) {
									//System.out.print(ops.getProperty().toString()+"\t");
									//System.out.print(ops.getDomain().toString());
									//System.out.println();
									rangeSub = ops.getRange().toString();
									rangeSub = rangeSub.substring(1,rangeSub.length()-1);
									OWLClass oSup = factory.getOWLClass(IRI.create(rangeSup));
									OWLClass oSub = factory.getOWLClass(IRI.create(rangeSub));
									if(!(oSup.toString().equals(oSub.toString()))) 
									{
									   OWLAxiom axiom = factory.getOWLDisjointClassesAxiom(Arrays.asList(oSup, oSub));
									   boolean classesAreDisjoint = reasoner.isEntailed(axiom);
									   if (classesAreDisjoint) 
									   {
										 printWriter4.println(relations);
									   }
									}
								}
							}
						}
					}//end dari if(!(check.contentEquals("Node( owl:bottomObjectProperty )")))
				}
			}			
		}
		printWriter4.close();
		long start5Time = System.nanoTime();
		//we disable pattern 5 until 7 for ISWC publication (because it is too long)
		//the fifth pattern		
		String prop1 = new String();
		String prop2 = new String();
		String relation1 = new String();
		String relation2 = new String();
		for(OWLObjectPropertyDomainAxiom oda1 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {
			relation1 = oda1.getProperty().getNamedProperty().toString();
			prop1 = oda1.getDomain().toString();
			prop1 = prop1.substring(1,prop1.length()-1);
			OWLClass oProp1 = factory.getOWLClass(IRI.create(prop1));
			
			for(OWLObjectPropertyDomainAxiom oda2 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {
				relation2 = oda2.getProperty().getNamedProperty().toString();
				if(!(relation1.equalsIgnoreCase(relation2))) {
					prop2 = oda2.getDomain().toString();
					prop2 = prop2.substring(1,prop2.length()-1);
					OWLClass oProp2 = factory.getOWLClass(IRI.create(prop2));
					if(!(oProp2.toString().equals(oProp1.toString()))) {
						OWLAxiom ax = factory.getOWLDisjointClassesAxiom(Arrays.asList(oProp1,oProp2));
						boolean classesAreDisjoint = reasoner.isEntailed(ax);
						if(classesAreDisjoint) {
							printWriter5.print(relation1+"\t"); printWriter5.print(relation2);
							printWriter5.println();
							//break;
						}
					}
				}
			}
		}
		printWriter5.close();
		long end5Time = System.nanoTime();
		System.out.println("module 5 took "+((end5Time-start5Time)/1000000)+" ms");
		//the sixth pattern
		//range of r1 is disjoint with domain of r2
		String relation6_1 = new String();
		String relation6_2 = new String();
		String range6 = new String();
		String doma6 = new String();		
			
		for(OWLObjectPropertyRangeAxiom ran7 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {
			relation6_1 = ran7.getProperty().getNamedProperty().toString();
			range6 = ran7.getRange().toString();
			range6 = range6 .substring(1,range6.length()-1);						
			OWLClass oRange6 = factory.getOWLClass(IRI.create(range6));
			for(OWLObjectPropertyDomainAxiom objd6 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {
				relation6_2 = objd6.getProperty().getNamedProperty().toString();
				if(!(relation6_1.equalsIgnoreCase(relation6_2))) {
					doma6 = objd6.getDomain().toString();
					doma6 = doma6 .substring(1,doma6.length()-1);				
					OWLClass odoma6 = factory.getOWLClass(IRI.create(doma6));	
					if(!(odoma6.toString().equals(oRange6.toString()))) {
						OWLAxiom ax6 = factory.getOWLDisjointClassesAxiom(Arrays.asList(oRange6,odoma6));
						boolean classesAreDisjoint = reasoner.isEntailed(ax6);
						if(classesAreDisjoint) {
							printWriter6.print(relation6_1+"\t"); printWriter6.print(relation6_2);
							printWriter6.println();
							//break;
						}
					}
				}
			}			
		}
		printWriter6.close();
		
		//the seventh pattern
		String prop1r = new String();
		String prop2r = new String();
		String relation1r = new String();
		String relation2r = new String();
		for(OWLObjectPropertyRangeAxiom oda1 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {
			relation1r = oda1.getProperty().getNamedProperty().toString();
			prop1r = oda1.getRange().toString();
			prop1r = prop1r.substring(1,prop1r.length()-1);
			OWLClass oProp1r = factory.getOWLClass(IRI.create(prop1r));
			
			for(OWLObjectPropertyRangeAxiom oda2 : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {
				relation2r = oda2.getProperty().getNamedProperty().toString();
				if(!(relation1r.equalsIgnoreCase(relation2r))) {
					prop2r = oda2.getRange().toString();
					prop2r = prop2r.substring(1,prop2r.length()-1);
					OWLClass oProp2r = factory.getOWLClass(IRI.create(prop2r));
					if(!(oProp1r.toString().equals(oProp2r.toString()))) {
						OWLAxiom ax = factory.getOWLDisjointClassesAxiom(Arrays.asList(oProp1r,oProp2r));
						boolean classesAreDisjoint = reasoner.isEntailed(ax);
						if(classesAreDisjoint) {
							printWriter7.print(relation1r+"\t"); printWriter7.print(relation2r);
							printWriter7.println();
							//break;
						}
					}
				}
			}
		}
		printWriter7.close();
		
		//the eighth pattern (find all asymmetric properties...)
		for(OWLAsymmetricObjectPropertyAxiom oba8 : ont.getAxioms(AxiomType.ASYMMETRIC_OBJECT_PROPERTY)) {
			printWriter8.println(oba8.getProperty().toString());
		}
		printWriter8.close();
		
		//the ninth pattern 
		for(OWLAsymmetricObjectPropertyAxiom oba9 : ont.getAxioms(AxiomType.ASYMMETRIC_OBJECT_PROPERTY)) {			
			OWLObjectPropertyExpression expr = oba9.getProperty();
			NodeSet<OWLObjectPropertyExpression> properties9 = reasoner.getSubObjectProperties(expr, false);
			//if the size == 1, it means the property does not have any subobject property.
			if(properties9.getNodes().size()>1){				
				//cek apakah properties9 ada yang symmetric.
				String check9 = new String();
				java.util.Iterator<Node<OWLObjectPropertyExpression>> itr9 = properties9.getNodes().iterator();
				while(itr9.hasNext()) {																
					check9 = itr9.next().toString();				
					if(!(check9.contentEquals("Node( owl:bottomObjectProperty )"))) {											
						if(check9.contains("InverseOf")){													
							String[] subProps = check9.split("InverseOf");																						
							if(subProps[0].length()<8) {
								//if list subproperty dimulai dari inverse dulu, maka penanganannya sbb:
								String[] temp = subProps[1].split("\\) ");
								//temp[1] adalah nama subproperty yang dicari.
								temp[1]=temp[1].substring(1,temp[1].length()-3);
								OWLObjectProperty opry9 = factory.getOWLObjectProperty(IRI.create(temp[1]));								
								for(OWLSymmetricObjectPropertyAxiom osa9 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
									if(osa9.getProperty().equals(opry9)) {																	
										printWriter9.println(osa9.getProperty().toString());										
									}
								}
							}else//list subproperty dimulai dari node dulu bukan inverse, penanganan sbb:
							{
								//String rangeSub = new String();
								String[] subPropx9 = subProps[0].split("Node\\( ");	
								//remove the character < di awal dan > di akhir string
								subPropx9[1] = subPropx9[1].substring(1,subPropx9[1].length()-2); 
								OWLObjectProperty oprx9 = factory.getOWLObjectProperty(IRI.create(subPropx9[1]));
								//for (OWLObjectPropertyRangeAxiom ops : ont.getAxioms(AxiomType.OBJECT_PROPERTY_RANGE)) {
								for(OWLSymmetricObjectPropertyAxiom osa9 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
									if(osa9.getProperty().equals(oprx9)) {
										printWriter9.println(osa9.getProperty().toString());										
									}
								}							
							}
						}
						else 
						{//check9 tidak mengandung inverse of
							String[] subPropx9 = check9.split("Node\\( ");
							subPropx9[1] = subPropx9[1].substring(1,subPropx9[1].length()-3);
							//temp[1]=temp[1].substring(1,temp[1].length()-3);
							OWLObjectProperty opry9 = factory.getOWLObjectProperty(IRI.create(subPropx9[1]));								
							for(OWLSymmetricObjectPropertyAxiom osa9 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
								if(osa9.getProperty().equals(opry9)) {									
									printWriter9.println(osa9.getProperty().toString());										
								}
							}
						}
					}
				}
			}
		}
		printWriter9.close();
		
		//the tenth pattern (need to remove the duplicate
		//r2 symmetric, r3 asymmetric
		//r1 subclassof r2, r1 subclassof r3, 
		//outputkan r1
		String subProprel = new String();		
		for(OWLSubObjectPropertyOfAxiom osa10 : ont.getAxioms(AxiomType.SUB_OBJECT_PROPERTY)) {			
			subProprel = osa10.getSubProperty().toString();
			OWLObjectPropertyExpression opr10 = osa10.getSubProperty();
			NodeSet<OWLObjectPropertyExpression> nopr10 = reasoner.getSuperObjectProperties(opr10);
		
			if(nopr10.getNodes().size()>1){				
				//cek untuk setiap entri di nopr10
				String check10 = new String();
				java.util.Iterator<Node<OWLObjectPropertyExpression>> itr10 = nopr10.getNodes().iterator();
				//iterate over the list of SuperProperties
				int markAsym = 0;
				int markSym = 0;
				while(itr10.hasNext()) {																
					check10 = itr10.next().toString();				
					if(!(check10.contentEquals("Node( owl:topObjectProperty )"))) {											
						if(check10.contains("InverseOf")){													
							String[] superProps = check10.split("InverseOf");																						
							if(superProps[0].length()<8) {
								//if list super property dimulai dari inverse dulu, maka penanganannya sbb:
								String[] temp = superProps[1].split("\\) ");
								//temp[1] adalah SUPER PROPERTY yang dicari.
								if(temp[1].contains("http"))
								{
									temp[1]=temp[1].substring(1,temp[1].length()-3);								
									OWLObjectProperty opry10 = factory.getOWLObjectProperty(IRI.create(temp[1]));								
									for(OWLAsymmetricObjectPropertyAxiom asy : ont.getAxioms(AxiomType.ASYMMETRIC_OBJECT_PROPERTY)) {
										if(asy.getProperty().equals(opry10)) {
											//check apakah ada super object property dari subProprel yang symmetric
											markAsym++;
											break;
										}
									}								
									for(OWLSymmetricObjectPropertyAxiom sym10 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
										if(sym10.getProperty().equals(opry10)) {
											markSym++;
											break;
										}
									}
									if((markAsym>0)&&(markSym>0)) {
										//ini dia
										markAsym = 0;
										markSym = 0;
										printWriter10.println(subProprel);
									}
								}
							}else//list subproperty dimulai dari node dulu bukan inverse, penanganan sbb:
							{
								//String rangeSub = new String();
								String[] superPropx10 = superProps[0].split("Node\\( ");	
								//remove the character < di awal dan > di akhir string
								superPropx10[1] = superPropx10[1].substring(1,superPropx10[1].length()-2); 
								OWLObjectProperty oprx10 = factory.getOWLObjectProperty(IRI.create(superPropx10[1]));
								for(OWLAsymmetricObjectPropertyAxiom asym : ont.getAxioms(AxiomType.ASYMMETRIC_OBJECT_PROPERTY)) {
									if(asym.getProperty().equals(oprx10)) {
										//check apakah ada super object property dari subProprel yang symmetric
										markAsym++;
										break;
									}
								}								
								for(OWLSymmetricObjectPropertyAxiom symm10 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
									if(symm10.getProperty().equals(oprx10)) {
										markSym++;
										break;
									}
								}
								if((markAsym>0)&&(markSym>0)) {
									//ini dia
									markAsym = 0;
									markSym = 0;
									printWriter10.println(subProprel);
								}							
							}
						}
						else 
						{//check10 tidak mengandung inverse of
							String[] superProper10 = check10.split("Node\\( ");
							superProper10[1] = superProper10[1].substring(1,superProper10[1].length()-3);							
							OWLObjectProperty opj10 = factory.getOWLObjectProperty(IRI.create(superProper10[1]));																
							for(OWLAsymmetricObjectPropertyAxiom asym : ont.getAxioms(AxiomType.ASYMMETRIC_OBJECT_PROPERTY)) {
								if(asym.getProperty().equals(opj10)) {
									//check apakah ada super object property dari subProprel yang symmetric
									markAsym++;
									break;
								}
							}								
							for(OWLSymmetricObjectPropertyAxiom symm10 : ont.getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {
								if(symm10.getProperty().equals(opj10)) {
									markSym++;
									break;
								}
							}
							if((markAsym>0)&&(markSym>0)) {
								//ini dia
								markAsym = 0;
								markSym = 0;
								printWriter10.println(subProprel);
							}							
						}						
					}
				}
			}
		}
		
		printWriter10.close();
		
		//the eleventh pattern
		for(OWLIrreflexiveObjectPropertyAxiom irl : ont.getAxioms(AxiomType.IRREFLEXIVE_OBJECT_PROPERTY)) 
		{
			printWriter11.println(irl.getProperty().toString());
		}
		printWriter11.close();
		
		long endTime = System.nanoTime();
		System.out.println("It took "+((endTime-startTime)/1000000)+" ms");
	}
}
