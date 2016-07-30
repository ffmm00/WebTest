package example;

import java.math.BigDecimal;

public class EraLogic {

	public boolean check(Era era) {
		if (era.getInning() == 0) {
			return false;
		}

		return true;
	}

	public double cul(Era era) {
		double res = 0;

		BigDecimal a = new BigDecimal(era.getRunsAllowed() * 9.0);
		BigDecimal b = new BigDecimal(era.getInning());

		res = a.divide(b, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(res);

		return res;

	}

}
