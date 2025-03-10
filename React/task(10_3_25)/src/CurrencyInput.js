import React from 'react';

function CurrencyInput(props) {
  return (
    <div className="form-group">
      <label>{props.label}</label>
      <input
        type="number"
        className="form-control"
        value={props.value}
        onChange={props.onChange}
      />
    </div>
  );
}

export default CurrencyInput;