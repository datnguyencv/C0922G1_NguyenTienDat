import React, { useState, useEffect } from "react";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import { Formik, Form, Field, ErrorMessage } from "formik";
import * as Yup from "yup";

export function EditBook() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [book, setBook] = useState(null);

   useEffect(() => async () => {
    try {
      const response = await axios.get(`https://my-json-server.typicode.com/codegym-vn/mock-api-books/books/${id}`);
      setBook(response.data);
    } catch (error) {
      console.log(error);
    }
  },[id]);

  const validationSchema = Yup.object().shape({
    title: Yup.string().required("Title is required"),
    quantity: Yup.number().required("Quantity is required"),
  });

  const handleSubmit = async (values) => {
    try {
      await axios.put(`https://my-json-server.typicode.com/codegym-vn/mock-api-books/books/${id}`, values);
      alert("Update successfully");
      navigate("/");
    } catch (error) {
      console.log(error);
    }
  };

  if (!book) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <h2>Edit Book</h2>
      <Formik
        initialValues={{
          title: book.title,
          quantity: book.quantity,
        }}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >
        <Form>
          <div>
            <label htmlFor="title">Title:</label>
            <Field type="text" id="title" name="title" />
            <ErrorMessage name="title" component="div" />
          </div>
          <div>
            <label htmlFor="quantity">Quantity:</label>
            <Field type="number" id="quantity" name="quantity" />
            <ErrorMessage name="quantity" component="div" />
          </div>
          <button type="submit">Update</button>
        </Form>
      </Formik>
    </div>
  );
}
