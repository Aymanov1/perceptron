package perceptron;

import org.apache.log4j.*;

public class PerceptronExecute {
	private static Logger logger = Logger.getLogger(PerceptronExecute.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Perceptron p = new Perceptron();
		double[][] inputs = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
		int[] outputs = { 0, 0, 0, 1 };

		p.Train(inputs, outputs, 0.2, 0.1, 200);
		logger.info(p.Output(new double[] { 0, 0 }));
		logger.info(p.Output(new double[] { 1, 0 }));
		logger.info(p.Output(new double[] { 0, 1 }));
		logger.info(p.Output(new double[] { 1, 1 }));

	}
}