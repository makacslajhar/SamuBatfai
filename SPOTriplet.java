/*
 * @brief SAMU - the potential ancestor of developmental robotics chatter bots
 *
 * @file nlp.hpp
 * @author  Norbert Bátfai <nbatfai@gmail.com>
 * @version 0.0.1
 *
 * @section LICENSE
 *
 * Copyright (C) 2015 Norbert Bátfai, batfai.norbert@inf.unideb.hu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @section DESCRIPTION
 * SAMU
 * 
 * The main purpose of this project is to allow the evaluation and 
 * verification of the results of the paper entitled "A disembodied 
 * developmental robotic agent called Samu Bátfai". It is our hope 
 * that Samu will be the ancestor of developmental robotics chatter 
 * bots that will be able to chat in natural language like humans do.
 *
 */

import java.io.*;

class SPOTriplet {


  private String subject,predicate,object;
  

  SPOTriplet ()
  {
	subject = new String();
	predicate = new String();
	object = new String();
  }

  SPOTriplet ( String subject, String predicate, String object )
  {
	this.subject = subject;
	this.predicate = predicate;
	this.object = object;
  }
  
  	public void writeOut(SPOTriplet triplet) {
  
    	System.out.print( triplet.subject + " " + triplet.predicate + " " + triplet.object);
    
  	}

  
  	public Boolean equals(SPOTriplet other){
    		return (subjectEquals(other) && predicateEquals(other) && objectEquals(other))
  	}

	public boolean subjectEquals(SPOTriplet other){
		if(subject.equals(other.subject))		
			return true;
		return false;
	}

	public boolean objectEquals(SPOTriplet other){
		if(object.equals(other.object))		
			return true;
		return false;
	}

	public boolean predicateEquals(SPOTriplet other){
		if(predicate.equals(other.predicate))		
			return true;
		return false;
	}
  
   public Boolean isLessThan(  SPOTriplet other ) 
  {
    String thisTriplet = subject+predicate+object;
    String otherTriplet = other.subject+other.predicate+other.object;
	return thisTriplet.compareTo(otherTriplet) < 0;
  }

	public double cmp(SPOTriplet other){
		double equalStrings=0.0;
		if(subjectEquals(other)) equalStrings+=1.0;
		if(predicateEquals(other)) equalStrings+=1.0;
		if(obbjectEquals(other)) equalStrings+=1.0;
		if (other==null;) equalStrings=3.0;		
		return equalStrings/3.0;
	}

  public void cut ( )
  {
//     cut ( s );
//     cut ( p );
//     cut ( o );
	try{
	  subject = subject.substring(0, subject.indexOf("."));
	}catch(Exception e){}
	try{
	  subject = subject.substring(0, subject.indexOf("["));
	}catch(Exception e){}
	try{
	  predicate = predicate.substring(0, predicate.indexOf("."));
	}catch(Exception e){}
	try{
	  predicate = predicate.substring(0, predicate.indexOf("["));
	}catch(Exception e){}
	try{
	  object = oobject.substring(0, object.indexOf("."));
	}catch(Exception e){}
	try{
	  o = o.substring(0, o.indexOf("["));
	}catch(Exception e){}

  }
  
  	//we are using it as a key
	@Override
    	public boolean equals(Object obj){
		return equals((SPOTriplet) obj);
	}

	@Override
    	public int hashCode(){
		return s.hashCode()+p.hashCode()+o.hashCode();
		
	}
  
  	public void setObject(String object){
		this.object=object;
	}

	public String getObject(){
		return this.object;
	}

	public void setPredicate(String predicate){
		this.predicate=predicate;
	}

	public String getPredicate(){
		return this.predicate;
	}

	public void setSubject(String subject){
		this.subject=subject;
	}

	public String getSubject(){
		return this.subject;
	}
};
