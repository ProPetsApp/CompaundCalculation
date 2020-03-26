package telran.java30;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class CountResult {

	@Setter
	private double startSum;
	@Setter
	private double endSum;
	@Setter
	private double percent;

	public double getCount() {
//	    	do {
//	    		startSum *= percent;
//	    		count++;
//	    	}while(startSum < endSum);
		try {
			BigDecimal bd = new BigDecimal(
					Double.toString(1.0 / (Math.log(percent / 100 + 1) / Math.log(endSum / startSum))));
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			return bd.doubleValue();
		} catch (Exception e) {
			return Double.POSITIVE_INFINITY;
		}

	}

}
