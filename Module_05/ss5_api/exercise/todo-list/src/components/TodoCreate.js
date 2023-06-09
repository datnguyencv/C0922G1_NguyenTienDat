import { Formik, Form, Field } from "formik";
import * as TodoServices from "../services/TodoServices";

export function TodoCreate() {
  return (
    <>
      <Formik
        initialValues={{ title: "" }}
        onSubmit={async (value) => {
          await TodoServices.save(value);
          alert("Thêm mới thành công");
        }}
      >
        <Form>
          <Field name="title" className="form-control" placeholder="Input here.." type="text"></Field>
          <button type="submit" className="btn btn-sm btn-dark">
            Submit
          </button>
        </Form>
      </Formik>
    </>
  );
}