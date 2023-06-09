import { BrowserRouter, Route, Routes } from "react-router-dom";
import {BookList} from "./components/BookList";
import {CreateBook} from "./components/CreateBook";
import {EditBook} from "./components/EditBook";    

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