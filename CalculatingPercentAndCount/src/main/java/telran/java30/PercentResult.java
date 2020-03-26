package telran.java30;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@NoArgsConstructor
public class PercentResult {
	
	@Setter  private double startSum;
	@Setter  private double endSum;  		 
	@Setter  private int count;
	
	public double getPercent() {	
		try {
			BigDecimal bd = new BigDecimal(Double.toString(
					(Math.pow((endSum/startSum), 1.0/count) - 1) * 100));
			    bd = bd.setScale(2, RoundingMode.HALF_UP);
				return  bd.doubleValue();
		} catch (Exception e) {
			return Double.POSITIVE_INFINITY;
		}
		
	}

}
