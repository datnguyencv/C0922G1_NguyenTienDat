import { useState } from "react";

export function Counter() {
  function useIncrement(addAmount) {
    const [count, setCount] = useState(0);

    const increment = () => {
      setCount((prevCount) => prevCount + addAmount);
    };

    return { count, increment };
  }

    const { count, increment } = useIncrement(1);
    const { count: countTwo, increment: incrementTwo } = useIncrement(2);

    return (
      <>
        <div style={{ textAlign: "center" }}>
          <h1>Số: {count}</h1>
          <button onClick={increment}>Thêm</button>
          <h1>Số Hai: {countTwo}</h1>
          <button onClick={incrementTwo}>Thêm +2</button>
        </div>
      </>
    );
  }
