package ua.lviv.iot.first_laba;

public class Printer {

	private static final String DEFAULT_COLOR = "red";
	private static final int DEFAULT_PRINT_PAGES_IN_MINUTE = 25;
	private static final int DEFAULT_PRICE_IN_HRN = 5000;
	private static final String DEFAULT_NAME = "Termo";
	private static final String DEFAULT_MODEL = "F-412";
	private static final String DEFAULT_MANUFACTURER = "samsung";
	private static final int DEFAULT_OPTIMAL_WORK_TIME_IN_YEARS = 5;
	private String name;
	private double priceInHrn;
	private int printPagesInMinute;
	private String color;
	private int otimalWorkTimeInYears;
	public static int guaranteeInMonth;
	protected String manufacturer;
	protected String model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceInHrn() {
		return priceInHrn;
	}

	public void setPriceInHrn(double priceInHrn) {
		this.priceInHrn = priceInHrn;
	}

	public int getPrintPagesInMinute() {
		return printPagesInMinute;
	}

	public void setPrintPagesInMinute(int printPagesInMinute) {
		this.printPagesInMinute = printPagesInMinute;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getOtimalWorkTimeInYears() {
		return otimalWorkTimeInYears;
	}

	public void setOtimalWorkTimeInYears(int otimalWorkTime) {
		this.otimalWorkTimeInYears = otimalWorkTime;
	}

	public Printer(String name, double priceInHrn, int printPagesInMinute, String color, int otimalWorkTimeInYears,
			String manufacturer, String model) {
		this.name = name;
		this.priceInHrn = priceInHrn;
		this.printPagesInMinute = printPagesInMinute;
		this.color = color;
		this.otimalWorkTimeInYears = otimalWorkTimeInYears;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Printer(String name, double priceInHrn, int printPagesInMinute, String color) {
		this(name, priceInHrn, printPagesInMinute, color, DEFAULT_OPTIMAL_WORK_TIME_IN_YEARS, DEFAULT_MANUFACTURER,
				DEFAULT_MODEL);

	}

	public Printer() {
		this(DEFAULT_NAME, DEFAULT_PRICE_IN_HRN, DEFAULT_PRINT_PAGES_IN_MINUTE, DEFAULT_COLOR);
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", priceInHrn=" + priceInHrn + ", printPagesInMinute=" + printPagesInMinute
				+ ", color=" + color + ", otimalWorkTimeInYears=" + otimalWorkTimeInYears + ", manufacturer="
				+ manufacturer + ", model=" + model + "]";
	}

	public static String staticGuaranteeInMonth() {
		return "Static guaranteeInMonth = " + Printer.guaranteeInMonth;
	}

	public String guaranteeInMonth() {
		return "guaranteeInMonth = " + Printer.guaranteeInMonth;
	}

	public void resetValues(String name, double priceInHrn, int printPagesInMinute, String color,
			int otimalWorkTimeInYears, String manufacturer, String model) {
		this.name = name;
		this.priceInHrn = priceInHrn;
		this.printPagesInMinute = printPagesInMinute;
		this.color = color;
		this.otimalWorkTimeInYears = otimalWorkTimeInYears;
		this.manufacturer = manufacturer;
		this.model = model;
	}
	

}
