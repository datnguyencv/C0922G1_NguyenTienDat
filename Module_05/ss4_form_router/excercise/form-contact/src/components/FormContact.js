import React, { useState } from "react";
import { ErrorMessage, Field, Form, Formik } from "formik";
import * as Yup from "yup";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { Vortex } from  'react-loader-spinner'

export default function FormContact() {
  return (
    <div>
      <Formik
        initialValues={{
          name: "Tiến Đạt",
          email: "tiendat@gmail.com",
          phone: "0986745452",
          message: "Một hai ba bốn năm sáu bảy tám chín mười",
        }}
        validationSchema={Yup.object({
          name: Yup.string()
            .required("Vui lòng nhập")
            .matches(
              /^[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđĐ ]{5,50}$/,
              "Tên bạn nhập chưa đúng. Vui lòng kiểm tra lại"
            ),
          email: Yup.string().matches(
            /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
            "Cần nhập đúng định dạng email. Vui lòng kiểm tra lại"
          ),
          phone: Yup.string().required("Vui lòng nhậP không để trống"),
        
          message: Yup.string().required("Vui lòng nhậP không để trống"),
        })}
        onSubmit={(value, { setSubmitting }) => {
          setTimeout(() => {
            console.log("Check");
            setSubmitting(false);
            toast(`Input form ${value.name} has been submitted`);
          }, 1500);
        }}
      >
        {({ isSubmitting }) => (
          <div className="container">
            <div>
              <h2 className="mt-2"> Contact Form </h2>
            </div>
            <Form>
              <div className="mb-2">
                <label htmlFor="name" className="form-label">
                  Name :
                </label>
                <Field
                  type="text"
                  id="name"
                  className="form-control form-control-sm"
                  name="name"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="name"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="email" className="form-label">
                  Email :
                </label>
                <Field
                  type="email"
                  id="email"
                  className="form-control form-control-sm"
                  name="email"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="email"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="phone" className="form-label">
                  Phone :
                </label>
                <Field
                  type="text"
                  id="phone"
                  className="form-control form-control-sm"
                  name="phone"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="phone"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="message" className="form-label">
                  Message :
                </label>
                <Field
                  type="textarea"
                  id="message"
                  className="form-control form-control-sm"
                  name="message"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="message"
                  className="error-flag"
                />
              </div>
              {isSubmitting ? (
                <Vortex
                visible={true}
                height="80"
                width="80"
                ariaLabel="vortex-loading"
                wrapperStyle={{}}
                wrapperClass="vortex-wrapper"
                colors={['red', 'green', 'blue', 'yellow', 'orange', 'purple']}
              />
              ) : (
                <button className="btn btn-sm btn-dark" type="submit">Submit</button>
              )}
            </Form>
          </div>
        )}
      </Formik>
      <ToastContainer/>
    </div>
  );
}
