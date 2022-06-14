package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            censusAnalyser.loadIndiaCensusData("IndiaStateCensusData.csv");
            censusAnalyser.loadIndianStateCode("IndiaStateCensusData.csv");
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
        }
    }
}