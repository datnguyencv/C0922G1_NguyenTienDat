import { TodoCreate } from "./components/TodoCreate";
import { TodoList } from "./components/TodoList";

function App() {
  return (
    <>
      <div className="container mx-auto" style={{ width: 800 }}>
        <h1 className="m-auto">Todo List</h1>
        <TodoCreate />
        <TodoList />
      </div>
    </>
  );
}

export default App;
