import { useState } from "react";

export function Counter() {
  const [counter, setCounter] = useState(0);
  const [counterTwo, setCounterTwo] = useState(0);
  const handleAdd = () => {
    setCounter(counter + 1);
  };

  const handleAddTwo = () => {
    setCounterTwo((prevState) => prevState + 2);
  };

  return (
    <>
      <div style={{textAlign: "center"}}>
        <h1> Number : {counter}</h1>
        <button onClick={handleAdd}>Add</button>

        <h1>Number Two : {counterTwo}</h1>
        <button onClick={handleAddTwo}> Add +2 </button>
      </div>
    </>
  );
}
