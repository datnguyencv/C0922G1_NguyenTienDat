import { BrowserRouter, Route, Routes } from "react-router-dom";
import BookList from "./component/BookList";
import CreateBook from "./component/CreateBook";
import EditBook from "./component/EditBook";    

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<BookList />} />
        <Route path="/add" element={<CreateBook />} />
        <Route path="/edit/:id" element={<EditBook />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
