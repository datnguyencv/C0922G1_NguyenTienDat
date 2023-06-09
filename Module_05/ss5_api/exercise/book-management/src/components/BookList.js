import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

export function BookList() {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    axios
      .get(`https://my-json-server.typicode.com/codegym-vn/mock-api-books/books`)
      .then((response) => setBooks(response.data))
      .catch((error) => console.log(error));
  }, []);

  const handleDelete = (id) => {
    axios
      .delete(`https://my-json-server.typicode.com/codegym-vn/mock-api-books/books/${id}`)
      .then(() => {
        alert("Delete successfully");
        setBooks(books.filter((book) => book.id !== id));
      })
      .catch((error) => console.log(error));
  };

  return (
    <div>
      <h1>Library</h1>
      <Link to="/add">Add a new Book</Link>
      <table className="table table-striped">
        <thead>
          <tr>
            <th>Title</th>
            <th>Quantity</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          {books.map((book) => (
            <tr key={book.id}>
              <td>{book.title}</td>
              <td>{book.quantity}</td>
              <td>
                <Link to={`/edit/${book.id}`}>Edit</Link>
              </td>
              <td>
                <button onClick={() => handleDelete(book.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
