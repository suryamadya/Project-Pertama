package com.dnd.project_6;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class Awt_2 extends Frame {

	/**
	 * Contoh Button
	 * author : Sidiq - UMBY
	 * @param args
	 */
	public static final long serialVersionUID = 1L;
	
	public Awt_2() {
		setTitle("Contoh Gambar"); //judul windows
	}
	
	public void paint(Graphics g) {
		g.drawString("Bangun 2 Dimensi", 20, 60);
		g.drawLine(20, 70, 100, 70);
		g.drawRect(20, 80, 100, 20);
		g.fillRect(20, 110, 100, 20);
		g.drawOval(20, 140, 30, 20);
		g.drawRoundRect(20, 170, 30, 20, 30, 20);
		g.fillRoundRect(60, 170, 30, 20, 30, 20);
		g.drawString ("NIM = 191110139", 150, 80);
		g.drawString("Nama = Surya Madya", 150, 100);
	
	}
	
	public boolean handleEvent(Event evt) {
		if (evt.id == Event.WINDOW_DESTROY) {
			System.exit(0);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Frame f = new Awt_2();
		f.setSize(300, 220);
		f.setVisible(true);
	}
	
}
