import { devtools } from 'zustand/middleware';

export const useActiveButtonStore = create<>()(
	devtools(set => ({
		activeButton,
	}))
);
