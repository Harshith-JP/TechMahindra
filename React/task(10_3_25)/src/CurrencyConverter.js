import React, { useState, useEffect } from 'react';
import apiData from './Api.json';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css'
function CurrencyConverter() {
  const [fromCurrency, setFromCurrency] = useState('USD');
  const [toCurrency, setToCurrency] = useState('EUR');
  const [amount, setAmount] = useState(1);
  const [convertedAmount, setConvertedAmount] = useState(null);
  const [currencies, setCurrencies] = useState([]);

  useEffect(() => {
    const baseCurrencyData = apiData.USD;
    if (baseCurrencyData && baseCurrencyData.rates) {
      setCurrencies(Object.keys(baseCurrencyData.rates));
      convertCurrency();
    }
  }, []);

  const handleFromCurrencyChange = (event) => {
    setFromCurrency(event.target.value);
  };

  const handleToCurrencyChange = (event) => {
    setToCurrency(event.target.value);
  };

  const handleAmountChange = (event) => {
    setAmount(event.target.value);
  };

  const convertCurrency = () => {
    if (apiData[fromCurrency] && apiData[fromCurrency].rates[toCurrency]) {
      setConvertedAmount((amount * apiData[fromCurrency].rates[toCurrency]).toFixed(2));
    } else {
      setConvertedAmount('Currency not found');
    }
  };

  useEffect(() => {
    convertCurrency();
  }, [fromCurrency, toCurrency, amount]);

  return (
    <div className="container mt-5" >
      <div className="card shadow p-4">
        <h2 className="mb-4 text-center">Currency Converter</h2>
        <div className="mb-3">
          <label className="form-label">Amount</label>
          <input
            type="number"
            className="form-control"
            value={amount}
            onChange={handleAmountChange}
          />
        </div>
        <div className="row mb-3">
          <div className="col-md-6">
            <div className="mb-3">
              <label className="form-label">From Currency</label>
              <select
                className="form-select"
                value={fromCurrency}
                onChange={handleFromCurrencyChange}
              >
                {Object.keys(apiData).map((currency) => (
                  <option key={currency} value={currency}>
                    {currency}
                  </option>
                ))}
              </select>
            </div>
          </div>
          <div className="col-md-6">
            <div className="mb-3">
              <label className="form-label">To Currency</label>
              <select
                className="form-select"
                value={toCurrency}
                onChange={handleToCurrencyChange}
              >
                {currencies.map((currency) => (
                  <option key={currency} value={currency}>
                    {currency}
                  </option>
                ))}
              </select>
            </div>
          </div>
        </div>
        <p className="lead text-center">
          {amount} {fromCurrency} = {convertedAmount} {toCurrency}
        </p>
      </div>
    </div>
  );
}

export default CurrencyConverter;