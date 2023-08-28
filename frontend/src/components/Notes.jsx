import { useEffect, useState } from 'react';
import axios from "axios";
import Note from './Note';

const notesUrl = 'http://localhost:8080/notes';

const Notes = () => {
  const [notes, setNotes] = useState([]);
  const [value, setValue] = useState("");

  useEffect(() => {
    axios.get(notesUrl).then(res => setNotes(res.data));
  }, []);

  const onChange = (event) => {
    setValue(event.target.value);
  };

  const addNote = () => {
    axios.post(notesUrl, { value })
      .then((response) => {
        setNotes([...notes, response.data]);
        setValue('');
      })
      .catch((error) => {
        alert(error);
      })
  };

  const handleKeyDown = (event) => {
    if (event.key === 'Enter') {
      addNote();
    }
  }

  return <div>
    {notes.map(({id, value}) => <Note key={id} value={value}/>)}
    <input value={value} onChange={onChange} onKeyDown={handleKeyDown}/>
    <button onClick={addNote}>send</button>
  </div>;
};

export default Notes;