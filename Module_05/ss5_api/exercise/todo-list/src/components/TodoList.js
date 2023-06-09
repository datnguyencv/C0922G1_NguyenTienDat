import { useEffect, useState } from "react";
import * as TodoServices from "../services/TodoServices";

export function TodoList() {
  const [todoList, setTodoList] = useState([]);
  useEffect(() => {
    const getAll = async () => {
      let rs = await TodoServices.findAll();
      setTodoList(rs);
    };
    getAll();
  }, []);

  return (
    <>
      <div className="table-responsive">
        <table
          className="table table-striped
      table-hover	
      table-primary
      align-middle"
        >
          <tbody>
            <tr>
              <th>User Id</th>
              <th>Id</th>
              <th>Title</th>
            </tr>
          </tbody>
          <tbody className="table-group-divider">
            {todoList.map((item, index) => (
              <tr className="table-primary" key={index}>
                <td>{item.userId}</td>
                <td>{item.id}</td>
                <td>{item.title}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}
