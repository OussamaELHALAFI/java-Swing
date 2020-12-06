package com.esisa.java.ed.business;

import java.util.Vector;

import com.esisa.java.ed.models.Document;


public class DocumentService {
	private Vector<Document> documents;
	
	public DocumentService() {
		documents = new Vector<>();
	}
	
	public void add(Document doc) {
		documents.add(doc);
	}

	public Vector<Document> getDocuments()  {
		return documents;
	}
	
}
