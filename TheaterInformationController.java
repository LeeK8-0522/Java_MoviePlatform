package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheaterInformationController implements ActionListener{
	private TheaterInformationView theaterInformationView;
	private String explanation = "";
	
	public TheaterInformationController(TheaterInformationView theaterInformationView) {
		this.theaterInformationView = theaterInformationView;
		this.theaterInformationView.setListener(this);
	}//initialize field in constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == theaterInformationView.getOriginalButton()) {
			OriginalExplanation();
			theaterInformationView.setExpanationTextArea(explanation);
			explanation = "";
		}
		else if(e.getSource() == theaterInformationView.getExtreme4DButton()) {
			Extreme4DExplanation();
			theaterInformationView.setExpanationTextArea(explanation);
			explanation = "";
		}
		else if(e.getSource() == theaterInformationView.getDolbyIMAXButton()) {
			DolbyIMAXExplanation();
			theaterInformationView.setExpanationTextArea(explanation);
			explanation = "";
		}
		else if(e.getSource() == theaterInformationView.getPetButton()) {
			PetExplanation();
			theaterInformationView.setExpanationTextArea(explanation);
			explanation = "";
		}
	}
	
	public void OriginalExplanation() {
		this.explanation += "->Theater Type: Original\n";
		this.explanation += "->Characteristic: This theater type utilizes a laser projector for superior image quality, and also features reclining sofa-style seats for utmost comfort.\n";
		this.explanation += "->Price: \n" + " (Adult) --- 10000 KRW\n";
		this.explanation += " (Senior) --- 8000 KRW\n";
		this.explanation += " (Child) --- 5000 KRW\n";
	}
	
	public void Extreme4DExplanation() {
		this.explanation += "->Theater Type: 4D Extreme\n";
		this.explanation += "->Characteristic: This theater boasts 4D effects, allowing you to experience various elements like wind, water, scent, heat, vibration, snow, and tactile sensations. Additionally, it features a 3D surround sound system designed by top audio experts for a superior auditory experience.\n";
		this.explanation += "->Price: \n" + " (Adult) --- 20000 KRW\n";
		this.explanation += " (Senior) --- 15000 KRW\n";
		this.explanation += " (Child) --- 10000 KRW\n";
	}
	
	public void DolbyIMAXExplanation() {
		this.explanation += "->Theater Type: Dolby & IMAX\n";
		this.explanation += "->Characteristic: This theater is a combination of Dolby's audio equipment, from one of the top audio companies, and IMAX's dominating screen size. Here, you can enjoy the delicate sound effects from Dolby and the overwhelming scale of an IMAX screen at the same time.\n";
		this.explanation += "->Price: \n" + " (Adult) --- 15000 KRW\n";
		this.explanation += " (Senior) --- 10000 KRW\n";
		this.explanation += " (Child) --- 8000 KRW\n";
	}
	
	public void PetExplanation() {
		this.explanation += "->Theater Type: Pet\n";
		this.explanation += "->Characteristic: This theater is a very special one where you can enjoy watching movies with your pets. Play areas and snacks are provided for the pets, and moviegoers can enjoy the movie at the same time.\n";
		this.explanation += "->Price: \n" + " (Adult) --- 12000 KRW\n";
		this.explanation += " (Senior) --- 9000 KRW\n";
		this.explanation += " (Child) --- 6000 KRW\n";
	}
}
