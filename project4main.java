import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.zip.CheckedInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.Set;

public class project4main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub		
		Scanner in = new Scanner(new File(args[0]));
		PrintStream out= new PrintStream(new File(args[1]));
		ArrayList<Vertex> greenTrains=new ArrayList<>();
		ArrayList<Vertex> redTrains=new ArrayList<>();
		ArrayList<Vertex> greenReindeers=new ArrayList<>();
		ArrayList<Vertex> redReindeers=new ArrayList<>();
		ArrayList<Vertex> allVertices=new ArrayList<>();
		Vertex source=new Vertex();
		Vertex sink=new Vertex();
		allVertices.add(source);
		allVertices.add(sink);
		int numberOfGreenTrains=in.nextInt();
		for(int i=0;i<numberOfGreenTrains;i++) {
			int capacity=in.nextInt();
			if(capacity>0) {				
				Vertex newVertex=new Vertex();
				allVertices.add(newVertex);
				source.edges.put(newVertex, capacity);	
				source.neighbors.add(newVertex);
				greenTrains.add(newVertex);
			}			
		}int numberOfRedTrains=in.nextInt();
		for(int i=0;i<numberOfRedTrains;i++) {
			int capacity=in.nextInt();
			if(capacity>0) {
				Vertex newVertex=new Vertex();
				allVertices.add(newVertex);
				source.edges.put(newVertex, capacity);			
				source.neighbors.add(newVertex);
				redTrains.add(newVertex);
			}			
		}int numberOfGreenReindeers=in.nextInt();
		for(int i=0;i<numberOfGreenReindeers;i++) {
			int capacity=in.nextInt();
			if (capacity>0) {
				Vertex newVertex=new Vertex();
				allVertices.add(newVertex);
				source.edges.put(newVertex, capacity);			
				source.neighbors.add(newVertex);
				greenReindeers.add(newVertex);
			}			
		}int numberOfRedReindeers=in.nextInt();
		for(int i=0;i<numberOfRedReindeers;i++) {
			int capacity=in.nextInt();
			if (capacity>0) {
				Vertex newVertex=new Vertex();
				allVertices.add(newVertex);
				source.edges.put(newVertex, capacity);
				source.neighbors.add(newVertex);
				redReindeers.add(newVertex);
			}			
		}int numberOfGiftTypes=in.nextInt();
		int totalNumberOfGifts=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int bd=0;
		int be=0;
		int cd=0;
		int ce=0;		
		for(int i=0;i<numberOfGiftTypes;i++) {
			String constraint=in.next();
			int capacity=in.nextInt();
			totalNumberOfGifts+=capacity;
			if(constraint.contains("a")) {
				if(capacity>0) {					
					Vertex newVertex=new Vertex();
					allVertices.add(newVertex);					
					newVertex.edges.put(sink, capacity);
					newVertex.neighbors.add(sink);
					Iterator<Vertex> gtItr=greenTrains.iterator();
					Iterator<Vertex> rtItr=redTrains.iterator();
					Iterator<Vertex> grItr=greenReindeers.iterator();
					Iterator<Vertex> rrItr=redReindeers.iterator();			
					if(constraint.contains("b")) {
						if(constraint.contains("d")) {								
							while(gtItr.hasNext()) {
								Vertex checkVertex=gtItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}							
						}else if(constraint.contains("e")) {								
							while(grItr.hasNext()) {
								Vertex checkVertex=grItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}							
						}else {						
							while(gtItr.hasNext()) {
								Vertex checkVertex=gtItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}while(grItr.hasNext()) {
								Vertex checkVertex=grItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);							
							}							
						}
					}else if(constraint.contains("c")) {
						if(constraint.contains("d")) {							
							while(rtItr.hasNext()) {
								Vertex checkVertex=rtItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}							
						}else if(constraint.contains("e")) {								
							while(rrItr.hasNext()) {
								Vertex checkVertex=rrItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}
						}else {							
							while(rtItr.hasNext()) {
								Vertex checkVertex=rtItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);								
							}while(rrItr.hasNext()) {
								Vertex checkVertex=rrItr.next();
								checkVertex.edges.put(newVertex, 1);
								checkVertex.neighbors.add(newVertex);									
							}							
						}
					}else if(constraint.contains("d")) {						
						while(gtItr.hasNext()) {
							Vertex checkVertex=gtItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);								
						}
						while(rtItr.hasNext()) {
							Vertex checkVertex=rtItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);							
						}						
					}else if(constraint.contains("e")) {							
						while(grItr.hasNext()) {
							Vertex checkVertex=grItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);								
						}
						while(rrItr.hasNext()) {
							Vertex checkVertex=rrItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);							
						}						
					}else {						
						while(gtItr.hasNext()) {
							Vertex checkVertex=gtItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);							
						}
						while(rtItr.hasNext()) {
							Vertex checkVertex=rtItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);								
						}
						while(grItr.hasNext()) {
							Vertex checkVertex=grItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);							
						}
						while(rrItr.hasNext()) {
							Vertex checkVertex=rrItr.next();
							checkVertex.edges.put(newVertex, 1);
							checkVertex.neighbors.add(newVertex);							
						}
					}
				}
			}else {
				if(constraint.contains("b")) {
					if(constraint.contains("d")){
						bd+=capacity;
					}else if(constraint.contains("e")) {
						be+=capacity;
					}else {
						b+=capacity;
					}
				}else if(constraint.contains("c")) {
					if(constraint.contains("d")) {
						cd+=capacity;
					}else if(constraint.contains("e")) {
						ce+=capacity;
					}else {
						c+=capacity;
					}
				}else if(constraint.contains("d")) {
					d+=capacity;
				}else if(constraint.contains("e")) {
					e+=capacity;
				}
			}
		}	
		Vertex bVertex = null;
		Vertex cVertex = null;
		Vertex dVertex = null;
		Vertex eVertex = null;
		Vertex bdVertex = null;
		Vertex beVertex = null;
		Vertex cdVertex = null;
		Vertex ceVertex = null;
		if(b>0) {
			bVertex= new Vertex();
			allVertices.add(bVertex);
			bVertex.edges.put(sink, b);
			bVertex.neighbors.add(sink);
		}
		if(c>0) {
			cVertex= new Vertex();
			allVertices.add(cVertex);
			cVertex.edges.put(sink, c);
			cVertex.neighbors.add(sink);
		}
		if(d>0) {
			dVertex= new Vertex();
			allVertices.add(dVertex);
			dVertex.edges.put(sink, d);
			dVertex.neighbors.add(sink);
		}
		if(e>0) {
			eVertex= new Vertex();
			allVertices.add(eVertex);
			eVertex.edges.put(sink, e);
			eVertex.neighbors.add(sink);
		}
		if(bd>0) {
			bdVertex= new Vertex();
			allVertices.add(bdVertex);
			bdVertex.edges.put(sink, bd);
			bdVertex.neighbors.add(sink);
		}
		if(be>0) {
			beVertex= new Vertex();
			allVertices.add(beVertex);
			beVertex.edges.put(sink, be);
			beVertex.neighbors.add(sink);
		}
		if(cd>0) {
			cdVertex= new Vertex();
			allVertices.add(cdVertex);
			cdVertex.edges.put(sink, cd);
			cdVertex.neighbors.add(sink);
		}
		if(ce>0) {
			ceVertex= new Vertex();
			allVertices.add(ceVertex);
			ceVertex.edges.put(sink, ce);
			ceVertex.neighbors.add(sink);
		}		
		Iterator<Vertex> gtItr=greenTrains.iterator();
		Iterator<Vertex> grItr=greenReindeers.iterator();
		Iterator<Vertex> rtItr=redTrains.iterator();
		Iterator<Vertex> rrItr=redReindeers.iterator();
		while(gtItr.hasNext()) {
			Vertex checkVertex=gtItr.next();
			if(b>0) {
				checkVertex.edges.put(bVertex, b);
				checkVertex.neighbors.add(bVertex);
			}if(bd>0) {
				checkVertex.edges.put(bdVertex, bd);
				checkVertex.neighbors.add(bdVertex);
			}if(d>0) {
				checkVertex.edges.put(dVertex, d);
				checkVertex.neighbors.add(dVertex);
			}
		}while(grItr.hasNext()) {
			Vertex checkVertex=grItr.next();
			if(b>0) {
				checkVertex.edges.put(bVertex, b);
				checkVertex.neighbors.add(bVertex);
			}if(be>0) {
				checkVertex.edges.put(beVertex, be);
				checkVertex.neighbors.add(beVertex);
			}if(e>0) {
				checkVertex.edges.put(eVertex, e);
				checkVertex.neighbors.add(eVertex);
			}
		}while(rtItr.hasNext()) {
			Vertex checkVertex=rtItr.next();
			if(c>0) {
				checkVertex.edges.put(cVertex, c);
				checkVertex.neighbors.add(cVertex);
			}if(cd>0) {
				checkVertex.edges.put(cdVertex, cd);
				checkVertex.neighbors.add(cdVertex);
			}if(d>0) {
				checkVertex.edges.put(dVertex,d);
				checkVertex.neighbors.add(dVertex);
			}
		}while(rrItr.hasNext()) {
			Vertex checkVertex=rrItr.next();
			if(c>0) {
				checkVertex.edges.put(cVertex, c);
				checkVertex.neighbors.add(cVertex);
			}if(ce>0) {
				checkVertex.edges.put(ceVertex,ce);
				checkVertex.neighbors.add(ceVertex);
			}if(e>0) {
				checkVertex.edges.put(eVertex, e);
				checkVertex.neighbors.add(eVertex);
			}
		}			
		int totalflow=0;
		while(level(source,sink,allVertices)) {				
			boolean check=true;
			while(check) {		
				Iterator<Vertex> visitItr=allVertices.iterator();
				while(visitItr.hasNext()) {
					visitItr.next().visit=false;
				}
				source.visit=true;
				int minFlow=path(source,sink,Integer.MAX_VALUE);				
				if(minFlow>0) {					
					totalflow+=minFlow;
				}else {
					check=false;
				}
			}
		}
		out.print(totalNumberOfGifts-totalflow);			
	}
	static boolean level(Vertex source,Vertex sink,ArrayList<Vertex> allVertices) {
		Iterator<Vertex> levelItr=allVertices.iterator();
		while(levelItr.hasNext()) {
			levelItr.next().level=-1;
		}source.level=0;
		Queue<Vertex> queue= new LinkedList<>();
		queue.add(source);
		while(queue.isEmpty()==false) {
			Vertex currentVertex=queue.poll();
			Iterator<Vertex> adjItr=currentVertex.neighbors.iterator();
			while(adjItr.hasNext()) {
				Vertex adjVertex=adjItr.next();				
				if(adjVertex.level==-1) {
					if(adjVertex==sink) {
						adjVertex.level=currentVertex.level+1;
						return true;
					}
					adjVertex.level=currentVertex.level+1;
					queue.add(adjVertex);
				}
			}
		}		
		return false;		
	}
	static int path(Vertex currentVertex,Vertex sink,int flow) {
		if(currentVertex==sink) {
			return flow;
		}
		Iterator<Vertex> adjItr=currentVertex.neighbors.iterator();
		while(adjItr.hasNext()) {
			Vertex adjVertex=adjItr.next();
			if(adjVertex.level==currentVertex.level+1&&adjVertex.visit==false) {
				adjVertex.visit=true;
				int minFlow=flow;				
				if(currentVertex.edges.get(adjVertex)<flow) {
					minFlow=currentVertex.edges.get(adjVertex);
				}
				minFlow=path(adjVertex,sink,minFlow);
				if(minFlow>0) {
					currentVertex.edges.replace(adjVertex, currentVertex.edges.get(adjVertex)-minFlow);
					if(currentVertex.edges.get(adjVertex)==0) {
						currentVertex.edges.remove(adjVertex);
						currentVertex.neighbors.remove(adjVertex);
					}
					if(adjVertex.neighbors.contains(currentVertex)) {
						adjVertex.edges.replace(currentVertex,adjVertex.edges.get(currentVertex)+minFlow);
					}else {
						adjVertex.edges.put(currentVertex,minFlow);
						adjVertex.neighbors.add(currentVertex);
					}					
					return minFlow;
				}
			}			
		}return -1;
	}
}