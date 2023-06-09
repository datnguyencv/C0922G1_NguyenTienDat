import React from "react";
import { ErrorMessage } from "formik";
import * as Yup from "yup";
import { Field, Form, Formik } from "formik";
import { BallTriangle } from "react-loader-spinner";
import { toast, ToastContainer } from "react-toastify";
import { useNavigate } from "react-router-dom";
import * as bookService from "../services/BookServices";

export function CreateBook() {
  const navigate = useNavigate();

  const validationSchema = Yup.object().shape({
    title: Yup.string().required("Title is required"),
    quantity: Yup.number().required("Quantity is required"),
  });

    return (
    <>
      <Formik
        initialValues={{
          title: "",
          quantity: "",
        }}
        validationSchema={validationSchema}
        onSubmit={(values, { setSubmitting }) => {
          const submit = async () => {
            await bookService.create(values);
            setSubmitting(false);
            toast(`Thông báo hiển thị ${values.title} thành công`);
            navigate("/");
          };
          submit();
        }}
      >
        {({ isSubmitting }) => (
          <Form>
            <h2>Add a new Book</h2>
            <label htmlFor="title">Title</label>
            <Field
              type="text"
              className="form-control"
              id="title"
              name="title"
            />
            <ErrorMessage name='title' id='title' className='text-bg-danger' component='span'
                                     />
            <label htmlFor="quantity">Quantity</label>
            <Field
              type="text"
              className="form-control"
              id="quantity"
              name="quantity"
            />
               <ErrorMessage name='quantity' id='quantity' className='text-bg-danger' component='span'
                                     />
            {isSubmitting ? (
              <BallTriangle
                height={100}
                width={100}
                radius={5}
                color="#4fa94d"
                ariaLabel="ball-triangle-loading"
                wrapperClass={{}}
                wrapperStyle=""
                visible={true}
              />
            ) : (
              <button type="submit" className="btn btn-outline-primary">
                Submit
              </button>
            )}
          </Form>
        )}
      </Formik>
      <ToastContainer
        position="top-right"
        autoClose={5000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="light"
      />
    </>
  );
}
