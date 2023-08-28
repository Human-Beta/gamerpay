import Note from './Note';
import { useState } from 'react';

const Notes = () => {
  const [notes, setNotes] = useState([
    { id: 1, value: "Hello" },
    { id: 2, value: "world!" },
    { id: 3, value: "How are you?" },
  ]);
  const [value, setValue] = useState("");

  const onChange = (event) => {
    setValue(event.target.value);
  };

  const addNote = () => {
    setNotes([...notes, {value: value}]);
    setValue('');
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