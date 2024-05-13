import { useState } from 'react';

export function useInput(initValue: string) {
	const [value, setValue] = useState<string>(initValue);

	return {
		value: value,
		onChange: (e: React.ChangeEvent<HTMLInputElement>) => {
			setValue(e.target.value);
		},
	};
}
