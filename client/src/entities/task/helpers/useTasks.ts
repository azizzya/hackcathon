import { taskService } from '@/shared/api/task.service';
import { useQuery } from '@tanstack/react-query';

export function useTasks() {
	return useQuery({
		queryKey: ['tasks'],
		queryFn: () => taskService.getAll(),
		select: ({ data }) => {
			return {
				currentTasks: data.filter(task => task.is_done === false),
				completedTasks: data.filter(task => task.is_done === true),
			};
		},
	});
}
