import { Component } from "react";

export class TodoApp extends Component {
  constructor() {
    super();
    this.state = {
      item: "",
      list: ["Làm bài tập", "Học bài mới"],
    };
  }

  handleChange = (value) => {
    this.setState({
      item: value,
    });
  };

  handleAddItem = () => {
    this.setState({
      item: "",
      list: [this.state.item, ...this.state.list],
    });
  };

  render() {
    return (
      <>
        <div style={{ textAlign: "center" }}>
          <h2> To do list </h2>
          <input
            value={this.state.item}
            onChange={(event) => this.handleChange(event.target.value)}
          />
          <button onClick={() => this.handleAddItem()}> Add</button>
          <ul>
            {this.state.list.map((item, index) => (
              <li style={{ listStyle: "none" }} key={index}>
                {" "}
                * {item}
              </li>
            ))}
          </ul>
        </div>
      </>
    );
  }
}
