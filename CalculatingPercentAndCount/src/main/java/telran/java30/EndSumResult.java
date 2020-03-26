package telran.java30;


import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@NoArgsConstructor
public class EndSumResult {
	
	@Setter  private double startSum; 		 
	@Setter  private int count;
	@Setter private double percent;
	
	public double getEndSum() {
		BigDecimal bd = new BigDecimal(Double.toString(
				Math.pow(Math.E, count * Math.log(percent / 100 + 1)) * startSum));
		    bd = bd.setScale(2, RoundingMode.HALF_UP);
			return  bd.doubleValue();
	}

}