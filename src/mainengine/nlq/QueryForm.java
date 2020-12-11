package mainengine.nlq;

public class QueryForm {
	
	protected String cubeName;
	protected String queryName;
	protected String aggregateFunction;
	protected String measure;
	protected String gamma;
	protected String sigma;
	
	public QueryForm() {
		cubeName = "";
		queryName = "";
		aggregateFunction = "";
		measure = "";
		gamma = "";
		sigma = "";
	}
	
	public QueryForm(String cubeName, String queryName, String aggregateFunction, String measure, String gamma, String sigma) {
		this.cubeName = cubeName;
		this.queryName = queryName;
		this.aggregateFunction = aggregateFunction;
		this.measure = measure;
		this.gamma = gamma;
		this.sigma = sigma;
	}
	
	//TODO
	//tests
	//na ftiaksw NLStringFromFile ston simplequeryprocessor
	public String getCubeName() {
		return cubeName;
	}
	
	public String getQueryName() {
		return queryName;
	}
	
	public String getAggregateFunction() {
		return aggregateFunction;
	}

	public String getMeasure() {
		return measure;
	}
	
	public String getGamma() {
		return gamma;
	}
	
	public String getSigma() {
		return sigma;
	}
	
	public String toString() {
		String analysedString = this.cubeName + "\n" +
				this.queryName + "\n" +
				this.aggregateFunction + "\n" +
				this.measure + "\n" +
				this.gamma + "\n" +
				this.sigma;
		return analysedString;
	}//end toString()
	
}//end class