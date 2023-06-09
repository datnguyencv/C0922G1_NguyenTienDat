import React, { useState } from "react";
import { ErrorMessage, Field, Form, Formik } from "formik";
import * as Yup from "yup";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { Vortex } from "react-loader-spinner";

export default function FormHeathy() {
  return (
    <div>
      <Formik
        initialValues={{
          name: "",
          idCard: "",
          yearOld: "",
          gender: "",
          nationality: "",
          company: "",
          position: "",
          hasInsurance: "",
          province: "",
          district: "",
          ward: "",
          street: "",
          phone: "",
          email: "",
          travel: [],
          signsOfIllness: [],
          contactWithStrangers: [],
        }}
        validationSchema={Yup.object({
          name: Yup.string()
            .required("Vui lòng nhập")
            .matches(
              /^[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđĐ ]{5,50}$/,
              "Tên bạn nhập chưa đúng. Vui lòng kiểm tra lại"
            ),
            yearOld: Yup.number().min(1900,"Nhập lớn hơn 1900").required("Vui lòng nhập không để trống"),
            idCard: Yup.string().required("Vui lòng nhập không để trống"),
          nationality: Yup.string().required("Vui lòng nhập không để trống"),
          company: Yup.string().required("Vui lòng nhập không để trống"),
          position: Yup.string().required("Vui lòng nhập không để trống"),
          phone: Yup.string().required("Vui lòng nhập không để trống"),
          street: Yup.string().required("Vui lòng nhập không để trống"),
          district: Yup.string().required("Vui lòng nhập không để trống"),
          ward: Yup.string().required("Vui lòng nhập không để trống"),
          message: Yup.string().required("Vui lòng nhập không để trống"),
          email: Yup.string()
            .required("Vui lòng nhập không để tróng")
            .matches(
              /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
              "Cần nhập đúng định dạng email. Vui lòng kiểm tra lại"
            ),
          travel: Yup.string().required("Vui lòng nhập không để trống"),
          signsOfIllness: Yup.string().required("Vui lòng nhập không để trống"),
          contactWithStrangers: Yup.string().required(
            "Vui lòng nhập không để trống"
          ),
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
          <div className="container mx-auto">
            <div>
              <h2 className="mt-2"> Tờ khai y tế </h2>
            </div>
            <Form>
              <div className="mb-2">
                <label htmlFor="name" className="form-label">
                  Họ và tên :
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
                <label htmlFor="idCard" className="form-label">
                  Số hộ chiếu /CMND :
                </label>
                <Field
                  type="text"
                  id="idCard"
                  className="form-control form-control-sm"
                  name="idCard"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="idCard"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="yearOld" className="form-label">
                  Năm sinh :
                </label>
                <Field
                  type="number"
                  id="yearOld"
                  className="form-control form-control-sm"
                  name="yearOld"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="yearOld"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="nationality" className="form-label">
                  Quốc tịch :
                </label>
                <Field
                  type="text"
                  id="nationality"
                  className="form-control form-control-sm"
                  name="nationality"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="nationality"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="gender" className="form-label">
                  Giới tính:
                </label>
                <div>
                  <label>
                    <Field type="radio" name="gender" value="0" />
                    Nam
                  </label>
                </div>
                <div>
                  <label>
                    <Field type="radio" name="gender" value="1" />
                    Nữ
                  </label>
                </div>
                <ErrorMessage
                  component="span"
                  name="gender"
                  className="error-flag"
                />
              </div>

              <div className="mb-3">
                <label htmlFor="company" className="form-label">
                  Công ty làm việc :
                </label>
                <Field
                  type="text"
                  id="company"
                  className="form-control form-control-sm"
                  name="company"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="company"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="position" className="form-label">
                  Bộ phận làm việc :
                </label>
                <Field
                  type="text"
                  id="position"
                  className="form-control form-control-sm"
                  name="position"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="position"
                  className="error-flag"
                />
              </div>
              <div>
                <div className="form-check mt-2">
                  <input
                    className="form-check-input"
                    type="checkbox"
                    defaultValue
                    defaultChecked
                  />
                  <label className="form-check-label" htmlFor>
                    Có thẻ bảo hiểm y tế
                  </label>
                </div>
              </div>
              <h2>Địa chỉ liên lạc tại Việt Nam</h2>
              <div className="mb-3">
                <label htmlFor="province" className="form-label">
                  Tỉnh thành :
                </label>
                <Field
                  type="text"
                  id="province"
                  className="form-control form-control-sm"
                  name="province"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="province"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="district" className="form-label">
                  Quận / Huyện :
                </label>
                <Field
                  type="text"
                  id="district"
                  className="form-control form-control-sm"
                  name="district"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="district"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="ward" className="form-label">
                  Phường / Xã :
                </label>
                <Field
                  type="text"
                  id="ward"
                  className="form-control form-control-sm"
                  name="ward"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="ward"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="street" className="form-label">
                  Số nhà/ Phố/ Tổ dân phố/ Thôn/ Đội :
                </label>
                <Field
                  type="text"
                  id="street"
                  className="form-control form-control-sm"
                  name="street"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="street"
                  className="error-flag"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="phone" className="form-label">
                  Điện thoại :
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
                <label htmlFor="email" className="form-label">
                  Email :
                </label>
                <Field
                  type="text"
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
              <h2>
                {" "}
                Trong 14 ngày qua, Anh/ Chị có đi qua quốc gia/ vùng lảnh thổ
                nào (có thể ghi nhiều quốc gia){" "}
              </h2>
              <div className="mb-3">
                <Field
                  type="text"
                  id="travel"
                  className="form-control form-control-sm"
                  name="travel"
                  aria-describedby="helpId"
                  placeholder
                />
                <ErrorMessage
                  component="span"
                  name="travel"
                  className="error-flag"
                />
              </div>

              <h2>
                {" "}
                Trong 14 ngày qua, Anh/ Chị có xuất hiện các dấu hiệu nào sau
                đây{" "}
              </h2>
              <div>
                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Sốt"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Sốt
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Ho"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Ho
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Khó thở"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Khó thở
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Viêm phổi"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Viêm phổi
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Đau họng"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Đau họng
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Mệt mỏi"
                    name="signsOfIllness"
                  />
                  <label className="form-check-label" htmlFor>
                    Mệt mỏi
                  </label>
                </div>
              </div>

              <h2> Trong 14 ngày qua, Anh/ Chị có tiếp xúc với </h2>
              <div>
                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Người bệnh hoặc nghi ngờ, mắc bệNh Covid 19"
                    name="contactWithStrangers"
                  />
                  <label className="form-check-label" htmlFor>
                    Người bệnh hoặc nghi ngờ, mắc bệNh Covid 19
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Người từ nước có bệnH Covid 19"
                    name="contactWithStrangers"
                  />
                  <label className="form-check-label" htmlFor>
                    Người từ nước có bệnH Covid 19
                  </label>
                </div>

                <div className="form-check mt-2">
                  <Field
                    className="form-check-input"
                    type="checkbox"
                    value="Người có biểu hiệN (Sốt, ho, khó thở, viêm phổi)"
                    name="contactWithStrangers"
                  />
                  <label className="form-check-label" htmlFor>
                    Người có biểu hiệN (Sốt, ho, khó thở, viêm phổi)
                  </label>
                </div>
              </div>

              {isSubmitting ? (
                <Vortex
                  visible={true}
                  height="80"
                  width="80"
                  ariaLabel="vortex-loading"
                  wrapperStyle={{}}
                  wrapperClass="vortex-wrapper"
                  colors={[
                    "red",
                    "green",
                    "blue",
                    "yellow",
                    "orange",
                    "purple",
                  ]}
                />
              ) : (
                <button className="btn btn-sm btn-dark" type="submit">
                  Submit
                </button>
              )}
            </Form>
          </div>
        )}
      </Formik>
      <ToastContainer />
    </div>
  );
}
